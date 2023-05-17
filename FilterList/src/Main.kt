fun filterList(list: List<Int>, condition: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (element in list) {
        if (condition(element)) result.add(element)
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = filterList(numbers) { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4, 6, 8, 10]

    val oddNumbers = filterList(numbers) { it % 2 != 0 }
    println(oddNumbers) // Output: [1, 3, 5, 7, 9]
}