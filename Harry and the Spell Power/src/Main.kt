data class Spell(val name: String, val power: Int)

fun main() {
    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }

    val res = spells.filter { it.power >= 40 }.sumOf { it.power }

    println(res)
}