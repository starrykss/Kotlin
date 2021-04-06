interface Pet {
    var category: String        // abstract 키워드가 없어도 기본은 추상 프로퍼티
    fun feeding()               // 마찬가지로 추상 메서드
    fun patting() {             // 일반 메서드 : 구현부를 포함하면 일반적인 메서드가 기본이 됨.
        println("Keep patting!")
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Coco", "small")
    println("Pet Category: ${obj.category}")
    obj.feeding()       // 구현된 메서드
    obj.patting()       // 일반 메서드
}