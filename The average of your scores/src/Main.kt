fun main() {
    val list = readln().split(" ").map { it.toDouble() }

    val res = list.reduce { acc, i -> acc + i } / list.size

    println(res)
}