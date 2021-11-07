package lesson4.lesson4_1

import java.io.Serializable

interface State : Serializable
interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) = println("default restore store")
}

class Button1 : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State
    inner class InnerButtonState {
        fun getOuterReference(): Button1 = this@Button1
    }
}
