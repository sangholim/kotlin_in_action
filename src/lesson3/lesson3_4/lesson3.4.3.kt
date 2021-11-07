package lesson3.lesson3_4

infix fun Any.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
   val (number, name) = 1 to "one"
    println("$number, $name");
}
