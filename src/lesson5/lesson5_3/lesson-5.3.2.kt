package lesson5.lesson5_3

import java.io.File

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numberTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numberTo100.sum())

    val file = File ("C:\\");
    println(file.isInsideHiddenDirectory())
}