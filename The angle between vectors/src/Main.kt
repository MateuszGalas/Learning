import kotlin.math.*

fun main() {
    val firstVector = readln().split(" ").map { it.toDouble() }
    val secondVector = readln().split(" ").map { it.toDouble() }

    val dot = firstVector[0] * secondVector[0] + firstVector[1] * secondVector[1]
    val magnitude = sqrt(firstVector[0].pow(2) + firstVector[1].pow(2)) *
        sqrt(secondVector[0].pow(2) + secondVector[1].pow(2))

    println(acos(dot / magnitude) / PI * 180)
}