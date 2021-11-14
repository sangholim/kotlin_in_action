package lesson6.lesson6_1

fun yellAt(person: JavaPerson) {
    // null pointer exception
    // println(person.name.toUpperCase() + "!!!")
    // null safe
    println((person.name ?: "AnyOne").toUpperCase() + "!!!")
}

fun main() {
    yellAt(JavaPerson(null))
}
