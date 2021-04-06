import java.io.*
import java.lang.Exception
import java.lang.StringBuilder

fun main() {
    val path = "D:\\test\\LetMeKnow.txt"

    // 단순 변환
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch (e: Exception) {

    } finally {
        br.close()
    }
}