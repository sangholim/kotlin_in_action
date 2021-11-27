package lesson7.lesson7_3

import lesson7.lesson7_1.Point

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main() {
    val rec = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rec)
    println(Point(1, 2) in rec)

}
