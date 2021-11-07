package lesson4.lesson4_2

import javax.naming.Context
import javax.swing.text.AttributeSet

open class View2 {
    constructor(ctx: Context)

    constructor(ctx: Context, attr: AttributeSet)
}


class MyButton : View2 {
    constructor(ctx: Context) : super(ctx) {
        // 추가 구현
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        // 추가 구현
    }
}