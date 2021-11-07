package lesson3.lesson3_5

fun main() {
    val string = "12.345-6.A"
    println(string.split("\\.|-".toRegex()));
    println(string.split(".", "-"));


}
