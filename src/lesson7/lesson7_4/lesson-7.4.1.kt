package lesson7.lesson7_4

data class NameComponent(val name: String, val extension: String)

fun splitFilename(fullName:String): NameComponent {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponent(name, extension)
}

fun main() {
    val (name, ext) = splitFilename("example.txt")
    println(name)
    println(ext)
}