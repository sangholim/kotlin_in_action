package lesson4.lesson4_1

open class RichButton: Clickable {
    fun disable() {} // 상속 불가능
    open fun animate() {} // 하위 클래스 에서 상속 가능
    override fun click() {} // 상위 클래스에서 선언된 함수를 구현
 }

open class RichButton2: Clickable {
    final override fun click() {} // 오버라이드 할수 없음
}

abstract class Animated {
    abstract fun animate() // 하위 클래스는 반드시 구현해야한다.
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()

}


