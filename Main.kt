fun main() {
    val list = readln().split(" ").map { it.toInt() }

    val res = list.all { it % 2 == 0 && it <= 20 }

    println(res)
}