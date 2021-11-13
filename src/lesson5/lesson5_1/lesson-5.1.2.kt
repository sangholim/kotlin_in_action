package lesson5.lesson5_1

data class Person5(val name: String, val age: Int)

fun main() {
    val people = listOf(Person5("Alice", 29), Person5("Bob", 31))
    println(people.maxBy{it.age})
    println(people.maxBy(Person5::age))

}