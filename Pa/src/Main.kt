fun main() {
    val text = readln()
    val modified = text.split(" ").filter { it.matches(""".*pa.*""".toRegex()) }.joinToString("\n")
    println(modified)
}