package lesson5.lesson5_1

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    // 변수에 저장된 람다 호출
    println(sum(1, 2));
    // 람다식 직접 호출 (비 효율적)
    { println(42) }()
    // 람다 본문 코드 실행
    run { println(42) }
    val people = listOf(Person5("Alice", 29), Person5("Bob", 31))
    println(people.maxBy { p: Person5 -> p.age })
    println(people.maxBy { p -> p.age })
    var names = people.joinToString(separator = " ", transform = { p: Person5 -> p.name })
    println(names)

    names = people.joinToString(separator = " ") { p: Person5 -> p.name }
    println(names)

}