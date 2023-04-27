fun main() {
    var list = readln().split(" ").map { it.toInt() }
    val list2 = mutableListOf<Int>()

    list.forEachIndexed { index, _ ->
        list = if (index % 2 == 0) {
            list2.add(list[0])
            list.drop(1)
        } else {
            list2.add(list[list.lastIndex])
            list.dropLast(1)
        }
    }

    println(list2.joinToString(" "))
}