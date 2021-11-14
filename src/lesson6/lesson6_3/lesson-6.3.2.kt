package lesson6.lesson6_3

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main() {
    val source = listOf(1, 2, 4, 5, 6, 7, 8)
    val target: MutableCollection<Int> = arrayListOf(9, 10)
    copyElements(source, target)
    println(target)
}