fun main() {
    val domains = readln().split(" ")

    val map = domains.map { it.lowercase() }.associateWith { listOf(it.length) }

    println(map.size)
    println(map)
}