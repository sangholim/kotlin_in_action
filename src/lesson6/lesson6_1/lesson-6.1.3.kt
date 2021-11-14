package lesson6.lesson6_1

class Address(
    val streetAddress: String, val zipCode: Int,
    val city: String, val country: String
)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return country ?: "Unknown"
}
fun main() {
    val person = Person("Dmitry", null)
    println(person.countryName())
}