package lesson5.lesson5_3

fun main() {
    // collection map filter lazy
    var sequence = listOf(1, 2, 3, 4, 5).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
    sequence.toList()
    println()
    // collection map find lazy
    println(
        listOf(1, 2, 3, 4, 5).asSequence().map { it * it }.find { it > 3 }
    )
}