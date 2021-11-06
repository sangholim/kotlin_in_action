package lesson3.lesson3_3

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postFix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postFix)
    return result.toString()
}

fun main() {
    println(listOf(1, 2, 3).joinToString());
    println(listOf(1, 2, 3).joinToString(separator = ";"));
    println(listOf(1, 2, 3).joinToString(separator = ";", prefix = "(", postFix = ")"));
}
