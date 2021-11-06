package lesson3.lesson3_2

import java.lang.StringBuilder

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postFix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postFix)
    return result.toString()
}

fun main() {
    println(joinToString(collection = listOf(1, 2, 3), separator = ";", prefix = "(", postFix = ")"));
}
