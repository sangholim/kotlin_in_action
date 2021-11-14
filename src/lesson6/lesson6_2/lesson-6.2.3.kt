package lesson6.lesson6_2

fun foo(l: Long) = println(l)
fun main() {
    val i = 1;
    val list = listOf(1L, 2L, 3L)
    val result = i.toLong() in list
    println(result)

    val b: Byte = 1
    val l = b + 1L
    foo(l)
}
