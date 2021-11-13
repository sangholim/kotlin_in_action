package lesson5.lesson5_4

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All Done") }
}


fun main() {
    createAllDoneRunnable().run()
}