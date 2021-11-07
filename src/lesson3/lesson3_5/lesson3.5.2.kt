package lesson3.lesson3_5

fun main() {
    val string = "/users/yoe/kotlin-book/chapter.adoc"
    val directory = string.substringBeforeLast("/")
    val fullName = string.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println(directory)
    println(fileName)
    println(extension)
}
