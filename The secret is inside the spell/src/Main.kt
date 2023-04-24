fun main() {
    val list = readln().split(" ")

    val res = list.map { it.last() }.joinToString("")

    println(res)
}