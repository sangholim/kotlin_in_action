package lesson2.lesson2_2

class Person(
    val name: String,
    val isMarried: Boolean
)


fun main() {
    var person = Person("a",true);
    println("${person.name} is ${if(person.isMarried) "결혼했음" else "미혼임"}");
}
