package lesson6.lesson6_1

import java.lang.IllegalArgumentException

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city $country")
    }
}

fun main() {
    val address = Address("Elsestr. 47", 80867, "Munich", "Germany")
    val jetBrains = Company("JetBrains" ,address)
    val person = Person("Dmitry", jetBrains)
    printShippingLabel(person)
    printShippingLabel(Person("Alex", null))
}