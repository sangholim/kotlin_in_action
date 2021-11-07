package lesson4.lesson4_1

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey")
    protected fun whisper() = println("Let's talk!")
}

/*
fun TalkativeButton.giveSpeech() { // internal class를 위부 선언 할수 없음
    yell(); // private 함수를 외부에서 호출 불가능
    whisper(); // 같은 패키지 안이라도 protected 함수를 외부에서 호출 불가능
}
 */



