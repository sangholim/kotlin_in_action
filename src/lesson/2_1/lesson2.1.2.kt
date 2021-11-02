package lesson.`2_1`

fun main(args: Array<String>) {
    println(max(1,2))
    println(maxExpression(1,2))
}

fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}

fun maxExpression(a: Int, b: Int) = if (a > b) a else b


