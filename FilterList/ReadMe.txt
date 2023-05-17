Write a function called filterList that takes in a list of integers and a lambda expression. The function should filter the list based on the provided lambda expression and return a new list containing only the elements that satisfy the condition.

Function Signature:
fun filterList(list: List<Int>, condition: (Int) -> Boolean): List<Int>

Example Usage:
val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val evenNumbers = filterList(numbers) { it % 2 == 0 }
println(evenNumbers) // Output: [2, 4, 6, 8, 10]

val oddNumbers = filterList(numbers) { it % 2 != 0 }
println(oddNumbers) // Output: [1, 3, 5, 7, 9]