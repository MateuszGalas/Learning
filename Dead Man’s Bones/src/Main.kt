data class Microphone(
    var track: String = "",
    var frequency: Int = 0,
    var effect: String = "",
    var sensitivity: Double = 0.0
)

fun main() {
    val microphone = Microphone()

    microphone.apply {
        microphone.track = readln()
        microphone.frequency = readln().toInt()
        microphone.effect = readln()
        microphone.sensitivity = readln().toDouble()
    }

    println(microphone)
}