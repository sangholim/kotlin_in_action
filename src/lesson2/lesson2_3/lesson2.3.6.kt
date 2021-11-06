package lesson2.lesson2_3

import java.lang.IllegalArgumentException

fun eval2(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval2(e.left) + eval2(e.right)
        else -> throw IllegalArgumentException("Unknown Expression")
    }


fun main() {
    // (1 + 2) + 4
    // eval(Sum(Sum(Num(1), Num(2)), Num(4)));
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))));
}