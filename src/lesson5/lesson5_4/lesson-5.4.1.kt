package lesson5.lesson5_4

fun postponeComputation(count: Int, value: Runnable) {}

fun main() {
    postponeComputation(1000, object : Runnable {
        override fun run() {
            println(42);
        }
    })
    // SAM 인 경우
    postponeComputation(1000) {println(42)}
}