fun main() {
    cases("Hello")                      // String 형
    cases(1)                            // Int 형
    cases(System.currentTimeMillis())   // 현재 시간(밀리초 단위)을 Long형 값으로 반환
    cases(MyClass())                    // 객체
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass() {}