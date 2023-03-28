fun main() {
    val list = readln().split(" ")
    val res = list.map { it.first().uppercase() + it.substring(1) }

    println(res)
}