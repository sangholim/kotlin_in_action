package lesson6.lesson6_1

fun ignoreNull(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main() {
    ignoreNull(null)
}