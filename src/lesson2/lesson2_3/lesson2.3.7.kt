package lesson2.lesson2_3

import java.lang.IllegalArgumentException

fun eval3(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val sum = eval3(e.left) + eval3(e.right)
            println("sum: $sum")
            sum
        }
        else -> throw IllegalArgumentException("Unknown Expression")
    }


fun main() {
    // (1 + 2) + 4
    println(eval3(Sum(Sum(Num(1), Num(2)), Num(4))));
}