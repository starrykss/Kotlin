interface Switcher {    // (1) 인터페이스의 선언
    fun on(): String
}

class Smartphone3(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB"
    }

    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher {       // (2) 익명 객체를 사용해 Switcher의 on() 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }   // 익명 객체(object) 블록의 끝
        return powerSwitch.on()         // 익명 객체의 메서드 사용
    }
}