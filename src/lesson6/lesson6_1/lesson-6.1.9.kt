package lesson6.lesson6_1

fun verifyUserInput(input:String?) {
    if(input.isNullOrBlank()) {
        println("Please fill in the required fields")
        return
    }

    println("Input: $input")
}

fun main() {
    verifyUserInput(null)
    verifyUserInput("test")
}