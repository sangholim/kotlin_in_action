package lesson5.lesson5_1

// 함수 파라미터를 람다 안에서 사용하기
fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

// 람다 안에서 바깥 함수의 로컬 변수 변경하기
fun printProblemCounts (responses: Collection<String>) {
    var clientError = 0
    var serverError = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientError++
        }
        if (it.startsWith("5")) {
            serverError++
        }
    }

    println("$clientError client errors, $serverError server errors")
}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found", "500 internal errors")
    printMessagesWithPrefix(errors, "Error:")
    printProblemCounts(errors)
    
}