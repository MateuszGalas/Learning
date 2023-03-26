fun main() {
    val list = readln().split(" ").map { it.toInt() }
    val number = readln().toInt()

    println(list.elementAtOrNull(number))
}