class User3(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()   // (1) 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }
    var age: Int = _age
}

fun main() {
    val user1 = User3(1, "Kildong", 35)
    user1.name = "coco"   // (2) 여기서 사용자 고유의 출력 코드가 실행
    println("user1.name = ${user1.name}")
}