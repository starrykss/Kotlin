fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val returnObj = person.apply {
        this.name = "Sean"
        skills = "Java"     // this 생략 가능
        "success"           // 사용되지 않음.
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "Dooly"
        skills = "C#"
        "success"
    }
    println(person)
    println("returnObj2: $returnObj2")
}