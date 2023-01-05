fun main() {
    val list = List<Int>(readln().toInt()) { readln().toInt() }
    val element = readln().toInt()
    println(list.count { it == element })
}