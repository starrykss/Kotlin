class Person6 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {    // 컴패니언 객체 사용
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person6.language)      // 인스턴스를 생성하지 않고 기본값 사용
    Person6.language = "English"   // 기본값 변경 가능
    println(Person6.language)      // 변경된 내용 출력
    Person6.work()                 // 메서드 실행
    // println(Person6.name)       // name은 컴패니언 객체가 아니므로 오류 발생
}