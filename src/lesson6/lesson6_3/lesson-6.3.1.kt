package lesson6.lesson6_3

fun addValidNumber(numbers: Collection<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of Valid Numbers: ${validNumbers.sum()}")
    println("Invalid Number's count: ${numbers.size - validNumbers.size}")
}

fun main() {
    addValidNumber(listOf(1, 3, 4, null, 6, 7, 8, 9, 10))
}