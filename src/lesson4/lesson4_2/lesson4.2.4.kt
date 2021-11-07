package lesson4.lesson4_2

class User2(val name: String) {
    var address: String = "undefined"
    set(value)  {
        println("""Address was changed for $name: "$field" -> "$value". """.trimIndent())
        field = value
    }
}



fun main() {
    val user = User2("Alice")
    user.address = "서울 특별시 47"
    user.address = "부산 광역시 47"
}