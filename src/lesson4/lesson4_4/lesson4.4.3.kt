package lesson4.lesson4_4

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person4(val name: String) {
    companion object : JSONFactory<Person4> {
        // interface level 상속, 구현 가능
        override fun fromJSON(jsonText: String): Person4 = Person4("a")
    }
}

// 확장 함수 가능
fun Person4.Companion.fromJSON(jsonText: String) : Person4 = Person4("a")
