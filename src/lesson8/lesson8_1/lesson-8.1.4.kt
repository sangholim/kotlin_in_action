package lesson8.lesson8_1

import lesson3.lesson3_2.joinToString
import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element) // toString 메서드를 통해 객체를 문자열로 반환
    }
    result.append(postfix)
    return result.toString()
}


fun <T> Collection<T>.joinToString(
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)? = { it.toString() }
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        var str = transform?.invoke(element) ?: element.toString()
        result.append(str) // toString 메서드를 통해 객체를 문자열로 반환
    }
    result.append(postfix)
    return result.toString()
}


fun main() {
    val letters = listOf("Alpha", "Beta")
    // letters를 소문자로 변환
    println(letters.joinToString { it.toLowerCase() })

    println(letters.joinToString(
        separator = "!",
        prefix = "<",
        postfix = ">",
        transform = { it.toUpperCase() }
    ))

}