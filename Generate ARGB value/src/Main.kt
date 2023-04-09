import java.awt.Color
import java.lang.IllegalArgumentException

fun printARGB() {
    val (alpha, red, green, blue) = readln().split(" ").map { it.toInt() }

    try {
        println(Color(red, green, blue, alpha).rgb.toUInt())
    } catch (e: IllegalArgumentException) {
        println("Invalid input")
    }
}
