import java.time.LocalDate

fun main() {
    val p1 = Customer("홍길동", "010-1234-5678")
    val p2 = Customer("김선달", "010-5678-1234")
    println(p1 < p2)
    println(p1 > p2)

    // 범위 연산자
    val start = LocalDate.now()
    val end = start..start.plusDays(15)
    println(start.plusWeeks(1) in end)  // true
    println(end)                                    // 2020-03-08..2020-03-23

    // invoke() 함수 사용
    val instance1 = InvokeOperator("코틀린을")
    instance1("배우자!")

    // is, !is
    val b: String = "코틀린을 배우자!"
    if (b is String) {
        println("String 타입")
    } else {
        println("String 타입이 아님")
    }
    
    open class A {}
    class B : A() {}    // B 클래스 -> A 클래스 상속
    
    val x = B()
    if (x is A) {
        println("A 타입임")
    } else {
        println("A 타입이 아님")
    }
    if (x is B) {
        println("B 타입임")
    } else {
        println("B 타입이 아님")
    }

    // Null 가능 타입 : 타입 이름 끝에 물음표(?)를 붙인다.
    val s1: String? = null  // 정상
    // val s2: String = null   // 컴파일 에러
    // val s3: String = s1     // 컴파일 에러

    // 문자열 길이 반환
    var str2: String = "코틀린을 배우자"
    println(str2.length)

    // a = null     // 컴파일 에러

    // var a: String? = "코틀린을 배우자"     // 컴파일 에러
    // println(a.length)

    // NULL 처리 연산자 #1: "?."
    // if (a != null) println(a.length)
    // = [ println(a?.leght) ]

    // NULL 처리 연산자 #2: "?:"
    var nt: String? = "코틀린을 배우자"
    val nt2 = nt?.length ?: 0  // val b: Int = if (a != null) a.length else 0
    println(nt)

    // NULL 처리 연산자 #3 : "!!" > NullPointerException 에러 명시적으로 표현
    var nt3: String? = "코틀린을 배우자"
    val nt4 = nt3!!.length
    println(nt4)

    // NULL 처리 연산자 #4: as, as?
    // val s1: String? = s2 as String?
    // val s1: String? = s2 as? String?

}

class Customer(val name: String, val phone: String) : Comparable<Customer> {
    override fun compareTo(other: Customer): Int {
        return compareValuesBy(this, other, Customer::name, Customer::phone)
    }
}

class InvokeOperator (val makeMessage1: String) {
    operator fun invoke(makeMessage2: String) {
        println("$makeMessage1 $makeMessage2!")
    }
}