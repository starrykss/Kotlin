import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    try {
        withTimeout(1300L) {      // Timeout 예외 발생. null로 처리하는 경우 withTimeoutOrNull() 사용
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("timed out with $e")
    }
}