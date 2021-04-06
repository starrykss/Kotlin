fun main() {
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2               // number1 = 21, number2 = 25
    number2 = number1 xor number2               // number1 = 21, number2 = 12
    number1 = number1 xor number2               // number1 = 25, number2 = 12

    println("number1 = " + number1)             // 25
    println("number2 = " + number2)             // 12
}