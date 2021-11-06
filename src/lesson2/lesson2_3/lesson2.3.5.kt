package lesson2.lesson2_3

import java.lang.IllegalArgumentException

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int {
    if(e is Num) {
        val n = e as Num
        return n.value
    }
    if(e is Sum) {
        return eval(e.right) + eval(e.left);
    }

    throw IllegalArgumentException("Unknown Expression")
}

fun main() {
    // (1 + 2) + 4
    // eval(Sum(Sum(Num(1), Num(2)), Num(4)));
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))));
}