package lesson6.lesson6_1

fun <T : Any> printHashCode(t: T) {
    println(t.hashCode())
}

fun main() {
    printHashCode(Person6("a", "b"))
    // Compile error
    // Null can not be a value of a non-null type TypeVariable(T)
    //printHashCode(null)

}