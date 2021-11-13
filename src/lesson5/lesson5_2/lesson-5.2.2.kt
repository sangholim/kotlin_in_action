package lesson5.lesson5_2

import lesson5.lesson5_1.Person5

val canBeInClub27 = { p: Person5 -> p.age <= 27 }

fun main() {

    val people = listOf(Person5("Alice", 26), Person5("Bob", 25), Person5("Jerry", 40))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))
}