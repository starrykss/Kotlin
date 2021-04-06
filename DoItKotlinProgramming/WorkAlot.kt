import kotlinx.coroutines.*

fun main() = runBlocking {
    val jobs = List(100_000) {      // 많은 양의 코루틴을 위한 List
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }      // 모든 jobs가 완료될 때까지 기다림.
}