fun main() {
    val sequence = MutableList<Int>(readln().toInt()) { readln().toInt() }
    var counter = 0

    for (i in 0..sequence.lastIndex - 2) {
        if (sequence[i] + 1 == sequence[i + 1] && sequence[i + 1] + 1 == sequence[i + 2]) {
            counter++
        }
    }
    println(counter)
}