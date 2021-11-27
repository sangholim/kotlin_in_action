package lesson7.lesson7_5

class ExtendPerson3 {
    // 추가 정보
    private val _attribute = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attribute[attrName] = value
    }

    // 필수 정보
    val name: String by _attribute
    //get() = _attribute["name"]!! // 수동으로 맵에서 정보를 꺼낸다.
}

fun main() {
    val p = ExtendPerson3()
    val data = mapOf("name" to "Dmitty", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)

    println(p.name)
}