package lesson7.lesson7_2

import lesson7.lesson7_1.Point

fun Point.equals(obj:Any?): Boolean {
    if (obj === this) return true // obj 와 같은 객체인지 체크
    if (obj !is Point) return false // 파라미터 타입이 다른 경우 false
    return obj.x == x && obj.y == y
}

fun main() {
    val p1 = Point(1,2)

    println(Point(1,2) == p1)
    println(Point(10,20) != p1)
    println(null == p1)

}