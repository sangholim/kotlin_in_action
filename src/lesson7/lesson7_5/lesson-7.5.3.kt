package lesson7.lesson7_5

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

/**
 * 위임할 객체의 데이터를 호출 및 변경을 담당
 * 변경시 listener를 통해 통지
 * 위임 객체 정보는 KProperty 에서 관리중
 *
 */
class ObserverableProperty(
    var propValue: Int, val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(p: ExtendPerson, prop: KProperty<*>): Int = propValue
    operator fun setValue(p: ExtendPerson, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

}

class ExtendPerson(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int by ObserverableProperty(age, changeSupport)
    var salary: Int by ObserverableProperty(salary, changeSupport)

}

class ExtendPerson2(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    private val observer = { prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)

}

fun main() {
    val p = ExtendPerson("Dmitty", 34, 2000)
    p.addPropertyChangeListener { event ->
        println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}")
    }

    p.age = 35;
    p.salary = 3000

    val p2 = ExtendPerson2("Gary", 40, 5000)
    p2.addPropertyChangeListener { event ->
        println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}")
    }

    p2.age = 50
    p2.salary = 10000
}