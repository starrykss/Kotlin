fun main() {
    shortFunc2(3) { println("First Call: $it") }
}

inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit) {     // noinline 키워드 추가
    println("Before calling out()")
    out(a)
    println("After calling out()")
}