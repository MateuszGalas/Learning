fun main() {
    readln().split(" ")
        .map { it.toDouble() }
        .groupingBy { if (it >= 5.0) "pass" else "fail" }
        .eachCount()
        .let(::println)
}