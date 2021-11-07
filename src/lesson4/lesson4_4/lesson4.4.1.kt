package lesson4.lesson4_4

import lesson2.lesson2_2.Person
import java.util.Comparator

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            // etc
        }
    }
}

data class Person1(val name: String) {
    object NameComparator : Comparator<Person1> {
        override fun compare(o1: Person1, o2: Person1): Int = o1.name.compareTo(o2.name)
    }
}

fun main() {
    Payroll.allEmployees
    Payroll.calculateSalary()

    var person = Person1("kk")
    var person2 = Person1("jj")

    println(Person1.NameComparator.compare(person, person2))


}