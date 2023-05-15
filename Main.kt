fun main(args: Array<String>) {
    val number = readln().toInt()
    var a = 0
    var b = 1
    val fibonnacci = mutableListOf(a, b)

    repeat(number - 2) {
        a = fibonnacci[fibonnacci.lastIndex - 1]
        b = fibonnacci[fibonnacci.lastIndex]
        fibonnacci.add(a + b)
    }

    println(fibonnacci)
}