import kotlin.math.*

fun main() {
    val (a, b, c) = List(3) { readln().toDouble() }

    val discriminant = b * b - 4 * a * c

    if (discriminant < 0) {
        println(null)
    } else if (discriminant == 0.0) {
        // One real root
        val root = -b / (2 * a)
        println("$root $root")
    } else {
        // Two real roots
        val root1 = (-b + sqrt(discriminant)) / (2 * a)
        val root2 = (-b - sqrt(discriminant)) / (2 * a)
        if (root1 > root2) println("$root2 $root1") else println("$root1 $root2")
    }
}