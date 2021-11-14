package lesson6.lesson6_3

fun main() {
    val list1 = arrayOf(1, 2, null, 4, 5)
    val list2 = arrayOfNulls<Int>(5)
    val list3 = Array<String>(25) { i -> ('A' + i).toString() }
    println(list1.joinToString(" "))
    println(list2.joinToString(" "))
    println(list3.joinToString(" "))
}
