package lesson2.lesson2_4

import java.util.*

fun main() {

    val binaryReps = TreeMap<Char, String>()
    for (i in 'A'..'F') {
        val binary = Integer.toBinaryString(i.toInt())
        binaryReps[i] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    val list = arrayListOf("10", "11", "1001")

    for((index, element) in list.withIndex()) {
        println("$index = $element")
    }
}