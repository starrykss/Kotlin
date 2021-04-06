fun main() {
    var a: Any = 1        // Any 형 a는 1로 초기화될 때 Int 형이 됨.
    a = 20L               // Int 형이었던 a는 변경된 값 20L에 의해 Long 형이 됨.
    println("a: $a type: ${a.javaClass}")   // a의 자바 기본형을 출력하면 long 이 나옴.
}