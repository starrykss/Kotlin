fun main() {
    println(calcFactorial1(5))
    println(calcFactorial2(5))
}

tailrec fun calcFactorial1(num: Int): Double {
    if (num == 1) {
        return 1.0
    }
    else {
        return (num * calcFactorial1(num - 1)).toDouble()
    }
}

fun calcFactorial2(num: Int): Double {
    var total: Double = 1.0
    for (i in num downTo 1) {
        total *= i
    }
    return total
}