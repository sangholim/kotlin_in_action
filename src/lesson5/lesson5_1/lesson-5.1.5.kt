package lesson5.lesson5_1

val getAge = { person: Person5 -> person.age }

fun Person5.isAdult() = age >= 21

fun main() {

    val age2 = ::getAge
    val predicate = Person5::isAdult
    val people = listOf(Person5("Alice", 20), Person5("Bob", 31))
    //println(people.maxBy(::getAge))
    println(people.maxBy(getAge))
    people.forEach {
        println(predicate(it))
    }
    println(people.maxBy(Person5::age))

}