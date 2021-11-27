package lesson7.lesson7_1

data class Point(val x:Int, val y:Int) {
    operator fun plus(other: Point) : Point {
        return Point(x + other.x, y + other.y)
    }
    operator fun times(scale: Double): Point {
        return Point((x * scale).toInt(), (y * scale).toInt())
    }
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)

    println(p1 + p2)
    println(p1.plus(p2))
    // 교환 법칙은 성립하지 않음
    println(p1 * 1.5)
    // 파라미터 타입과 반환 타입이 달라도 연산 가능
    println('a' * 3)
}