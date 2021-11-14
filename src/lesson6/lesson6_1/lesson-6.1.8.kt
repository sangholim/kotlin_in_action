package lesson6.lesson6_1

import kotlin.test.assertEquals

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    fun setUp() {
        myService = MyService()
    }

    fun testAction() {
        assertEquals("foo", myService.performAction())
    }
}
