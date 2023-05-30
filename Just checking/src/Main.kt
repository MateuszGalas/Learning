fun main() {
    List(readln().toInt()) { readln().toInt() }.apply {
        val (p, n) = readln().split(" ").map { it.toInt() }
        println(if (p in this && n in this) "YES" else "NO")
    }
}