fun main() {
    readln().split(" ").map { it.toInt() }.dropLastWhile { it % 2 == 0 }.let(::println)
}
