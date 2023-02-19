fun main() {
    val start = readln().toInt()
    val end = readln().toInt()
    val n = readln().toInt()
    println((start..end).count { it % n == 0 })
}