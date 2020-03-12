fun main(args: Array<String>) {
    println(makeMessage1(1))
    println(makeMessage1(2))
    println(makeMessage2(1))
    println(makeMessage2(2))

    var s: String = "변경 전의 값"
    println(s)
    s = "변경 후의 값"
    println(s)

    val str1 = "삶이 그대를 속일지라도\n슬퍼하거나 노하지 말라\n"
    println(str1)
    // """ 사용 : Indent(공백)까지 모두 표현
    val str2 = """
        삶이 그대를 속일지라도
        슬퍼하거나 노하지 말라
        슬픈 날엔 참고 견디라
        즐거운 날이 오고야 말리니
        """
        println(str2)

    // """ 사용 with trimMargin() : 공백 없이 출력하기
    var str3 = """
        >마음은 미래를 바라느니
        >현재는 한없이 우울한 것
        >모든 것 하염없이 사라지나
        >지나가 버린 것 그리움 되리니 - (푸쉬킨)
    """.trimMargin(">") // '|'문자가 기본으로 사용됨
    println(str3)

    val c = "66".toInt()
    val d = "123.5".toDouble()
    println("$c, $d")

    val count = 77
    var s1 = "Count = $count"              // "Count = 77"
    val s2 = "$s1 의 길이는 ${s1.length}"    // "Count == 77의 길이는 10"
    println(s1)
    println(s2)

    // 코틀린 1.1 버전부터는 리터럴 값을 알아보기 쉽게 값의 중간에 언더바(_)를 사용할 수 있다.
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 1234_5678_9012_3456L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("$oneMillion, $creditCardNumber, $socialSecurityNumber, $hexBytes, $bytes")

    // 배열 생성(1)
    val item = arrayOf("사과", "바나나", "키위")

    // 배열 내용물 출력
    for (fruit in item) {
        println(fruit)
    }

    // 배열 생성(2) : Array 클래스의 생성자를 사용하는 방법
    val num1 = Array<String>(5, { i -> (i * i).toString() })     // way1
    val num2 = Array<String>(5) { i -> (i * i).toString() }      // way2

    // 배열 내용물 출력
    for (item in num1) {
        println(item)
    }

    // 기본 타입 배열의 선언과 생성
    val intItem: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val intNum = IntArray(5, {i -> (i * i) })   // way1
    val intNum1 = IntArray(5) { i -> (i * i) }  // way2
    // 배열의 각 요소 값은 인덱스를 사용해서 읽거나 쓸 수 있다.
    intNum[0] = intNum[1] + intNum[2]

}

fun makeMessage1(msgType: Int) : String {
    return if (msgType == 1) "안녕하세요!" else "또 만났군요!"
}
fun makeMessage2(msgType: Int) = if (msgType == 1) "날씨 좋죠?" else "참 맑군요!"

// 함수의 실행 코드가 여러 개의 표현식으로 되어 있을 때
/* fun makeMessage(msgType: Int) : String {
        return if (msgType == 1) "날씨 좋죠?" else "참 맑군요!!"
    }
 *
 */

// if문은 변수를 초기화하는 대입문에도 사용할 수 있음.
// (코틀린에서는 if문을 표현식으로 간주함.)
//  var greeting = if (msgType == 1) "날씨 좋죠?" else "참 맑군요!!"