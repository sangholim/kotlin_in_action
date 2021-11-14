package lesson6.lesson6_1

class Person6(val firstName: String, val lastName: String) {

    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person6 ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = Person6("Dmitry", "Jemerov")
    val p2 = Person6("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}