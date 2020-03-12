fun main() {
    val m1 = Score(100, 200)
    val m2 = Score(300, 400)
    val m3 = Score(300, 400)
    println(m1 + m2)
    println(m1 * m2)    // 확장함수 오버로딩
    println(-m1)

    // 비트 연산자
    println(8 shr 2)        // 부호 비트 그대로, 오른쪽으로 비트 이동
    println(8 shl 4)        // 부호 비트 그대로, 왼쪽으로 비트 이동
    println(8 ushr 4)      // 부호 비트 포함, 오른쪽으로 비트 이동
    println(0xC0 and 0x0C)  // AND 연산
    println(0xC0 or 0x0C)   // OR 연산
    println(0xC0 xor 0xC0)  // XOR 연산
    println(0xC0.inv())     // 비트 값을 반대로 바꿈
    val a1 = 8
    println(a1+8 shr 2)     // 4

    // 논리 연산자 사용 : 코틀린 1.1부터 논리 연산 함수, 연산자 모두 사용 가능
    val b1: Boolean = true
    val b2: Boolean = false
    val b3: Boolean = false
    if ((b1 || b2) && !b3)
        println("True!")
    if ((b1 or b2) and b3.not())
        println("True!")

    // 동등 연산자
    println(m2 == m3)
    println(m2 === m3)
    println(m2.equals(m3))

    // 비교 연산자
    var it1: Int = 2
    var it2: Int = 3
    println(it1.compareTo(it2) > 0)     // println(it1 > it2)
    println(it1.compareTo(it2) < 0)     // println(it1 < it2)


}

data class Score(val a: Int, val b: Int) {
    operator fun plus (other: Score): Score {   // 연산자를 오버로딩 하는 함수는 맨 앞에 operator 키둬드를 붙어야 함.
        return Score(a + other.a, b + other.b)
    }
}

// 확장함수 추가
operator fun Score.times(other: Score): Score {
    return Score(a * other.a, b * other.b)
}

operator fun Score.unaryMinus(): Score {
    return Score(-a, -b)
}