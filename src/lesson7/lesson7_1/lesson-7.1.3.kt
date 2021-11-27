package lesson7.lesson7_1

import java.math.BigDecimal

operator fun Point.unaryMinus() : Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var p1 = Point(2,3)
    // x to -x, y to -y
    println(-p1)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(bd)
    println(++bd)


}