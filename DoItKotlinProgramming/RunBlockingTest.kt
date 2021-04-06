import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {        // main() 함수가 코루틴 환경에서 실행됨.
    launch {    // 백그라운드로 코루틴 실행
        delay(1000L)
        println("World!")
    }
    print("Hello, ")    // 즉시 이어서 실행됨.
    // delay(2000L)     // delay() 함수를 사용하지 않아도 코루틴을 기다림.
}