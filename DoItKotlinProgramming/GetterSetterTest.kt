class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id           // 불변 (읽기 전용)
    var name: String = _name    // 변경 가능
    var age: Int = _age         // 변경 가능
}

fun main() {
    val user = User(1, "Sean", 30)

    val name = user.name    // 게터에 의한 값 획득

    user.age = 41   // 세터에 의한 값 지정

    println("name: $name, ${user.age}")
}