fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e : Exception) {
        println(e.message)
    } finally {
        println("이 문장은 무조건 실행됩니다.")
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if (amount < 1000) {
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")
    }
}