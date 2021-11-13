package lesson5.lesson5_2

data class Book(val title: String, val authors: Collection<String>)

fun main() {
    val strings = listOf("abc", "efg")
    println(strings.flatMap { it.toList() })
    // flatten list 내에 list 원소를 단읠 원소로 변경하는 작업
    val books = listOf(
        Book("a", listOf("a-author", "b-author")),
        Book("b", listOf("b-author", "b-author")),
        Book("c", listOf("a-author", "d-author")),
        Book("d", listOf("b-author", "d-author")),
        Book("e", listOf("a-author", "e-author")),
        Book("f", listOf("c-author", "e-author"))
    )
    println(books.flatMap { it.authors.toList() }.toList())
    println(books.flatMap { it.authors.toList() }.toSet())
}