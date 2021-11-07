package lesson4.lesson4_3

data class Client2(val name: String, val postalCode: Int) {
  //  fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client2(name, postalCode)
}


fun main() {
    val client = Client2("이름", 111111)
    val client2 = Client2("이름", 111111)

    println(client.equals(client2))
    println(client == client2)
}