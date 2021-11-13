package lesson5.lesson5_2

import lesson5.lesson5_1.Person5

fun main() {
    val people = listOf(Person5("Alice", 25), Person5("Bob", 25), Person5("Jerry", 40))
    println(people.groupBy(Person5::age))
}