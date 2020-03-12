fun main() {
    println(min(20,40))
    println(min(valueRight = 30, valueLeft = 20))   // 인자 순서를 바꿔도 작동한다.
    printHello("Sangsoon")

    // 가변 인자 Test
    val list = newList(1, 2, 3)
    val e = arrayOf(7, 8, 9)
    val list2 = newList(1, 2, 3, *e, 5) // 배열도 전달 가능 (*연산자를 붙여준다.)
    println(list2)
}
//##############################################################################################################
fun min(valueLeft: Int, valueRight: Int): Int {
    // 매개변수 : valueLeft(Int형), valueRigh(Int형) / 반환타입 : Int
    return if(valueLeft < valueRight) valueLeft else valueRight
}
//1//
/* `if(valueLeft < valueRight) valueLeft else valueRight`는 다음 코드와 동일하다.
 * if(valueLeft < valueRight) {
 *    return valueLeft
 * } else {
 *    return valueRight
 * }
 */

//2// (=) fun min(valueLeft: Int, valueRight: Int) = if(valueLeft < valueRight) valueLeft else valueRight

//3// 지명인자(named aurgment) 지정
// fun min(valueLeft: Int = 0, valueRight: Int = 0) = if(valueLeft < valueRight) valueLeft else valueRight
//##############################################################################################################

fun printHello(name: String): Unit {
    // 매개변수 : name(String형) / 반환타입 없음 (함수 안에 return문을 적지 않아도 된다.)
    println("Hello, $name")
}

// 가변 인자
fun <T> newList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts)   // ts는 배열이다
        result.add(t)
    return result
}