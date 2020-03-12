fun main() {
    // #1
    val item1 = listOf("사과", "바나나", "키위")
    for (item in item1) {
        println(item)
    }

    // #2
    val item2 = listOf("사과", "바나나", "키위")
    for (index in item2.indices) {
        println("item at $index is ${item2[index]}")
    }

    // #3
    val item3 = arrayOf("사과", "바나나", "키위")
    for (index in item3.indices) {
        println("item at $index is ${item3[index]}")
    }

    // 카운터 지정
    for (i in 1..100) { /*...*/ }           // 1부터 100까지 반복. i값은 1씩 증가
    for (i in 1 until 100) { /*...*/ }      // 1부터 100까지 반복하되 100은 제외, i값은 1씩 증가
    for (i in 2..100 step 2) { /*...*/ }    // 2부터 10까지 반복하되, i값은 2씩 증가
    for (i in 10 downTo 1) { /*...*/ }      // 10부터 싲가하여 i값을 1씩 감소하면서 반복
}
