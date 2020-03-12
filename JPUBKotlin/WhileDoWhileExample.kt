fun main() {
    // # while
    val items = listOf("사과", "키위", "바나나")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    // # do-while
    index = 0
    do {
        println("item at $index is ${items[index]}")
        index++
    } while (index < items.size)
}