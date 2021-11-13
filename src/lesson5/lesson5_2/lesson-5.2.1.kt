package lesson5.lesson5_2

import lesson5.lesson5_1.Person5

fun main() {

    val people = listOf(Person5("Alice", 29), Person5("Bob", 31), Person5("Jerry", 40))

    // list filter
    println(people.filter { it.age % 2 == 0 })
    // list map
    println(people.map(Person5::age))
    // list filter and map
    println(people.filter { it.age % 2 == 0 }.map(Person5::age))
    // map class
    val maps = mapOf(1 to "One", 2 to "Two")
    println(maps)

}
