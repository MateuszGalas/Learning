fun main() {
    val list = readln().split(" ")

    val res = list.sumOf { it.length.takeIf { it >= 4 } ?: 0 }

    println(res)
}