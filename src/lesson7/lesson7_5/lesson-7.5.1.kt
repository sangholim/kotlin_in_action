package lesson7.lesson7_5

import kotlin.reflect.KProperty

class Foo {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

fun main() {
    var f = Foo()
    val oldValue = f.p // Delegate.getValue(..)
    f.p = "test" // Delegate.setValue(..)
}