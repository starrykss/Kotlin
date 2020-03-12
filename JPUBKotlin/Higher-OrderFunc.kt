fun main() {
    val v1 = calc(2, 7, {a, b -> a * b})
    val v2 = calc(2, 7, {a, b -> a + b})
    val v3 = calc(2, 7, {a, b -> a - b})

    println("The Result is $v1")
    println("The Result is $v2")
    println("The Result is $v3")
}

// 상위차 함수
fun calc(value1: Int, value2: Int, execCode: (codeParam1: Int, odeParam2: Int) -> Int): {
    return execCode(value1, value2)
}

// 인라인 함수
/*
inline fun calc(value1: Int, value2: Int, execCode: (codeParam1: Int, odeParam2: Int) -> Int): {
    return execCode(value1, value2)
*/