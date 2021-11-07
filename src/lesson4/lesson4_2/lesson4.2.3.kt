package lesson4.lesson4_2

interface User1 {
    val email: String
    val nickname: String
    get() = email.substringBefore('@')
}

class PrivateUser(override val email: String) : User1

class SubscribeUser(override val email: String) : User1



fun main() {
    println(PrivateUser("test@test.com").nickname);
    println(SubscribeUser("test@test.com").nickname);
}