open class Parent

class Child2: Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child2()         // Parent 형식의 obj1은 Child의 자료형으로 변환될 수 있음.
    // val obj2: Child2 = Parent()         // 오류! 자료형 불일치

    // val obj3: Cup<Parent> = Cup<Child2>()    // 오류! 자료형 불일치
    // val obj4: Cup<Child2> = Cup<Parent>()   // 오류! 자료형 불일치

    val obj5 = Cup<Child2>()             // obj5는 Cup<Child>의 자료형이 됨.
    val obj6: Cup<Child2> = obj5        // 자료형이 일치하므로 OK!
}