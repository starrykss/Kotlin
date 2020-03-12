/*
fun main() {

}

interface PlayMusic {
    val musicalInstrument: String
    fun play()
}

class Professional(override val musicalInstrument: String) : PlayMusic {
    override fun play() {}
}

class Amateur : PlayMusic {
    override var musicalInstrument: String = "Piano"
    override fun play() {}
}

open class MusicType {
    open fun sing() {}
}

interface PlayMusic {
    val musicalInstrument: String
    fun play()
}

// 클래스 상속과 인터페이스 구현을 동시에 : : 다음에 ,를 사용해서 지정
class Professional(override val musicalInstrument: String): MusicType(), PlayMusic {
    override fun play() {}
    oevrride fun sing() {}
}

// 추상 클래스
/*
abstract class PlayMusic {
    val musicalInstrument: String = "피아노"
    abstract fun play()
    fun sing() {}
}

class Professional(): PlayMusic() {
    override fun play() {}
}
*/
//--------------------------------------------------------------------------------------

*/