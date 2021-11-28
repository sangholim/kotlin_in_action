package lesson8.lesson8_1

import java.lang.StringBuilder

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter (predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate (element)) sb.append(element)
    }

    return sb.toString()
}
fun main() {
    twoAndThree { a, b -> a + b }

    twoAndThree { a, b -> a * b }

    println("abc".filter { it in 'a'..'z' })
}