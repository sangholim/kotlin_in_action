package lesson4.lesson4_2

open class User(val nickname:String = "", val isSubscribed: Boolean = false)
class TwitterUser(nickname: String) : User(nickname)

class Secretive private constructor() {}
