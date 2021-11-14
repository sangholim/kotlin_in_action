package lesson6.lesson6_2

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    // return 값은 Unit 로 선언
    override fun process() {
        // return 값 명시할 필요 없음
    }
}