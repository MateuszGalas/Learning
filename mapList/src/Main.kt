fun mapList(list: List<Int>, mapper: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    list.forEach {
        result.add(mapper(it))
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = mapList(numbers) { it * it }
    println(squaredNumbers) // Output: [1, 4, 9, 16, 25]
}