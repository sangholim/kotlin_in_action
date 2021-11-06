package lesson2.lesson2_2

class Rectangle(val height: Int, val width: Int) {
    // 프로터티 게터 선언
    val isSquare: Boolean
    get() = height == width
}


fun main() {
    var rectangle = Rectangle(4, 4);
    println("${if (rectangle.isSquare) "정사각형" else "직사각형"}");
}
