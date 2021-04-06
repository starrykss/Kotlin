class Calc2<T: Number> {        // 클래스의 형식 매개변수 제한
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val calc = Calc2<Int>()
    println(calc.plus(10, 20))

    val calc2 = Calc2<Double>()
    val calc3 = Calc2<Long>()
    // val calc4 = Calc2<String>()        // 재한된 자료형으로 인해 오류 발생!

    println(calc2.plus(2.5, 3.5))
    println(calc3.plus(5L, 10L))
}