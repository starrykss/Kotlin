import kotlinx.coroutines.*
/*
fun main() = runBlocking<Unit> {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            println("Bye!")
        }
    }
    delay(1300L)
    job.cancelAndJoin()   // 작업을 취소하고 완료될 때까지 기다림
    println("main: Quit!")
}
*/

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val job = GlobalScope.launch {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {   // 조건을 계산에 의해 반복
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}