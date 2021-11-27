package lesson7.lesson7_5

data class Email(val email: String)

fun loadEmails(person: Person): List<Email> {
    val email = Email("${person.name}@test.com")
    println("$email")
    return listOf(email)
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
    /*
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this) // 최초 접근시 초기화
            }
            return _emails!! // 저장해 둔 이메일이 있으면 그 데이터를 반환
        }

     */

}

fun main() {
    val p = Person("kbs")
    // call loadEmail when emails'object is null
    p.emails
    p.emails
}