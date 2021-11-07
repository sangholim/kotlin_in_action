package lesson4.lesson4_4

class User4 private constructor(val nickname: String) {

    companion object {
        fun newSubscribeUser(email: String) = User4(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User4(getFacebookName(accountId))
    }
}

fun getFacebookName(facebookAccountId: Int): String = "facebook-id: $facebookAccountId"

fun main() {
    val subscribeUser = User4.newSubscribeUser("bob@gmail.com")
    val facebookUser = User4.newFacebookUser(123)
    println("${subscribeUser.nickname}, ${facebookUser.nickname}")

}