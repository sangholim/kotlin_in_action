package lesson7.lesson7_3

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> { // LocalDate 원소에 iterator 구현
        var current = start
        override fun hasNext() = current <= endInclusive // comareTo 관례를 사용해 날짜 비교
        override fun next() = current.apply { // 현재 날짜를 저장한 다음에 날짜 수정, 그 후 저장해둔 날짜를 반환
            current = plusDays(1) // 현재 날짜를 1일 뒤로 변경
        }
    }


fun main() {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for(dayOff in daysOff) { println(dayOff)}
}