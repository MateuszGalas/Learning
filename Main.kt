fun main() {
    val a = readln().toLong()
    val b = readln().toLong()

    (a until b).reduce(Long::times).let(::print)
}