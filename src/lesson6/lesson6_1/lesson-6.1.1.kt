package lesson6.lesson6_1

fun strLen(s: String) = s.length

fun strLenWithNull(s: String?) = s?.length ?: 0

fun main() {
    // compile error
    // Null can not be a value of a non-null type String
    // strLen(null)

    // compile safe
    println(strLenWithNull(null))
    println(strLenWithNull("aaa"))

}