package lesson8.lesson8_1

enum class Delivery { STANDARD, EXPEDITION }

class Order(val itemCount: Int)

fun getShippingCostCalculator(
    delivery: Delivery
): (Order) -> Double { // 함수를 반환하는 함수를 선언한다.
    if (delivery == Delivery.EXPEDITION) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> 1.2 * order.itemCount }
}

data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startWithPrefix
        }
        return { startWithPrefix(it) && it.phoneNumber != null }
    }

}

fun main() {
    // 반환받은 함수를 변수에 저장
    val calculator = getShippingCostCalculator(Delivery.EXPEDITION)
    // 반환 받은 함수를 호출
    println("Shipping costs ${calculator(Order(3))}")

    val contacts = listOf(
        Person("Dmitty", "Jemerov", "123-4567"),
        Person("Svetlana", "Isakova", null),
    )
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}