package lesson8.lesson8_3

data class Person(val name: String, val age: Int)

fun lookForAlice(person: List<Person>) {
    for (person in person) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun lookForEachAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}


fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    lookForAlice(people)
    lookForEachAlice((people))
}
