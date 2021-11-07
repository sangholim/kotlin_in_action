package lesson3.lesson3_3

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val str = "Kotlin?"
    println(str.lastChar)
    val sb =StringBuilder(str)
    sb.lastChar = '!'
    println(sb)
}
