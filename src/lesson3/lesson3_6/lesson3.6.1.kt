package lesson3.lesson3_6

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    user.validateBeforeSave()

}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw  IllegalArgumentException("Can't save user ${id} empty $fieldName")
        }
        println("save user ${id} $fieldName: $value")
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun main() {

    saveUser(User(1, "만득", "서울특별시"))

}
