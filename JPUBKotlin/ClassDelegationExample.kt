// 클래스 상속과 다형성(polymorphism)을 이용한 위임 구현
/*
fun main() {
    var r = Rectangle()
    var c = Circle()
    Window(r).drawFigure()
    Window(r).fillFigure()
    Window(c).drawFigure()
    Window(c).fillFigure()
}

open class Figure() {
    open fun draw() {}
    open fun fill() {}
}

class Rectangle() : Figure() {
    override fun draw() {
        println("Draw Rectangle")
    }
    override fun fill() {
        println("Fill Rectangle")
    }
}

class Circle() : Figure() {
    override fun draw() {
        println("Draw Circle")
    }
    override fun fill() {
        println("Fill Circle")
    }
}

class Window(val figure: Figure) {
    fun drawFigure() {
        figure.draw()
    }
    fun fillFigure() {
        figure.fill()
    }
}
*/

// 클래스 위임을 이용한 위임 구현
fun main() {
    val r = Rectangle()
    val c = Circle()
    Window(r).draw()
    Window(r).fill()
    Window(c).draw()
    Window(c).fill()
}

interface Figure {
    fun draw()
    fun fill()
}

class Rectangle() : Figure {
    override fun draw() {
        println("Draw Rectangle")
    }
    override fun fill() {
        println("Fill Rectangle")
    }
}

class Circle() : Figure {
    override fun draw() {
        println("Draw Circle")
    }
    override fun fill() {
        println("Fill Circle")
    }
}

class Window(val figure: Figure) : Figure by figure {}