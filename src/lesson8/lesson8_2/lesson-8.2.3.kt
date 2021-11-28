package lesson8.lesson8_2

data class Person(val name: String, val age: Int)

fun main() {
    // 람다를 이용한 컬렉션 처리
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age < 30 })
    // 컬렉션 직접 거르기
    val result = mutableListOf<Person>()
    for (person in people) {
        if (person.age < 30) result.add(person)
    }
    println(result)
}
