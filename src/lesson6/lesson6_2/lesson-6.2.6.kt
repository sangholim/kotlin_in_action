package lesson6.lesson6_2

import lesson6.lesson6_1.Person
import lesson6.lesson6_1.Person6
import java.lang.IllegalStateException

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    //fail("kkk")

    val person = Person("", null)
    val company = person.company ?: fail("not found company")

}