Exercise: Implement a mapList function that takes a list of integers and a mapping function, and returns a new list where each element is 
the result of applying the mapping function to the corresponding element in the original list.

Function signature: fun mapList(list: List<Int>, mapper: (Int) -> Int): List<Int>

Example usage:
val numbers = listOf(1, 2, 3, 4, 5)
val squaredNumbers = mapList(numbers) { it * it }
println(squaredNumbers) // Output: [1, 4, 9, 16, 25]

In this exercise, you need to implement the mapList function that takes a list of integers (list) and a mapping function (mapper). 
The function should apply the mapping function to each element in the list and return a new list containing the transformed values.