package chap07.section2

class Smartphone2(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB"   // 바깥 클래스의 프로퍼티 접근
    }

    fun powerOn(): String {
        class Led(val color: String) {    // 지역 클래스 선언
            fun blink(): String = "Blinking $color on $model"   // 외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red")    // 여기에서 지역 클래스가 사용됨.
        return powerStatus.blink()
    } // powerOn() 블록 끝
}

fun main() {
    val myphone = Smartphone2("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}