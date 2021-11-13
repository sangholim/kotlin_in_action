package lesson5.lesson5_5

import java.lang.StringBuilder

fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}


fun alphabet5() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}


fun main() {
    println(alphabet4())
    println(alphabet5())
}
