fun main() {
    val l = mutableListOf(1, 2, 3)
    l.swap(0, 2)
    println(l)
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}