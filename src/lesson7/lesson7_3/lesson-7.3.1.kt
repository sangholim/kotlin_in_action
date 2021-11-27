package lesson7.lesson7_3

import lesson7.lesson7_1.Point
import java.lang.IndexOutOfBoundsException

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
fun main() {
    val p = Point(20, 30)
    println(p[0])
    println(p[1])
    val mutablePoint = MutablePoint(5,4);
    mutablePoint[1] = 42
    println(mutablePoint)

}