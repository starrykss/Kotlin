import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class User6(val id: Int, val name: String, var grade: String = "Normal") {
    fun check() {
        if (grade == "Normal") println("You need to get the Silver grade")
    }
}

fun main() {
    // 타입 출력
    println(User6::class)       // 클래스 레퍼런스를 위해 ::class 사용
    // 클래스의 프로퍼티와 메서드의 정보 출력
    val classInfo = User6::class
    classInfo.memberProperties.forEach {
        println("Property name: ${it.name}, type: ${it.returnType}")
    }
    classInfo.memberFunctions.forEach {
        println("Function name: ${it.name}, type: ${it.returnType}")
    }

    // 함수에 전달해 자료형을 알아냄.
    getKotlinType(User6::class)
}

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}