fun main() {
    println("합계는 ${sum1(10, 20)} 입니다.")        // 기존 형태로 정의된 덧셈 함수 실행
    println("합계는 ${sum2(10, 20)}입니다.")         // 코틀린 특유의 형태로 정의된 덧셈 함수 실행
    
    val sum3: (Int, Int) -> Int = {x, y -> x + y}   // 람다식으로 작성된 덧셈 함수 #1
    println("합계는 ${sum3(10, 20)} 입니다.")
    
    val sum4 = {a: Int, b: Int -> a + b}            // 람다식으로 작성된 덧셈 함수 #2
    println("합계는 ${sum4(10, 20)} 입니다.")
}

fun sum1(a: Int, b: Int): Int {             // 기존 형태의 덧셈 함수
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b       // 코틀린 특유의 대입문 형태로 정의된 덧셈 함수