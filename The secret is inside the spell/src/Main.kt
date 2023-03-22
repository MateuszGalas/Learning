fun main() {
    val list = readln().split(" ")
    var sum = 0
    val res = mutableListOf<Int>()

    for (i in 0..list.lastIndex) {
        res.add(sum)
        sum += list[i].length
    }
    res.add(sum)

    println(res)
}