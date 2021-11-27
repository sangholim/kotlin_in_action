package lesson7.lesson7_1

fun main() {
    var p1 = Point(1,1)
    p1 += Point(3,4)
    println(p1)

    val list = arrayListOf(1,2)
    list += 42
    println(list)

    val newList = list + listOf(4,5)
    println(newList)


}