package lesson2.lesson2_4

fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c:Char) = c !in '0'..'9'

fun main() {
    println("${isLetter('q')}, ${isNotDigit('a')}")
    println("ddd" in arrayListOf("abc","ddd"))
}