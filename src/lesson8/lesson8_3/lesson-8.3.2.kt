package lesson8.lesson8_3

private fun lookForAlice2(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

private fun lookForAlice3(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    lookForAlice2(people)
    lookForAlice3(people)
}