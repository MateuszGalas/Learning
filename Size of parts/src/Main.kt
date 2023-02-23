fun main() {
    val list = List(readln().toInt()) { readln().toInt() }
    println("${list.count { it == 0 }} ${list.count { it == 1 }} ${list.count { it == -1 }}")
}
