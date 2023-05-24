Exercise: Given a list of strings, write a function that returns the count of all distinct words across the strings. 
The function should ignore case sensitivity and consider punctuation marks as part of the word. Use higher-order functions like flatMap, distinct, map, and toSet to solve the problem.

Example:
Input: ["Hello, world!", "Kotlin is awesome!", "World is Kotlin"]
Output: 5 (since there are five distinct words: "hello", "world", "kotlin", "is", "awesome")

Instructions:
Implement a function countDistinctWords that takes a list of strings as input and returns the count of distinct words.
Split each string into words, ignoring case sensitivity and considering punctuation marks as part of the word.
Use higher-order functions like flatMap, distinct, map, and toSet to manipulate the list of words and calculate the count of distinct words.
Test your implementation with different inputs to ensure it works correctly.