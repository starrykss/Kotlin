import java.io.*

fun main() {
    val path = "D:\\test\\LetMeKnow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: Exception) {
        println(e.message)
    }
}