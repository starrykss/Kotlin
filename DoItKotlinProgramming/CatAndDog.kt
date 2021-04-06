open class Animal(val name: String)

// (1) feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
    fun playWithPet(dog: Dog) {     // (2) 각 애완동물 종류에 따라 오버로딩됨.
        println("Enjoy with my dog.")
    }

    fun playWithPet(cat: Cat) {     // (3) 고양이를 위한 메서드
        println("Enjoy with my cat.")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}