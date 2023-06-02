import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AnagramTest {

    @Test
    fun testIsAnagram() {
        // Test cases with expected results
        assertTrue(isAnagram("listen", "silent"))
        assertTrue(isAnagram("rail safety", "fairy tales"))
        assertTrue(isAnagram("schoolmaster", "the classroom"))
        assertTrue(isAnagram("debit card", "bad credit"))

        // Test cases with non-anagrams
        assertFalse(isAnagram("hello", "world"))
        assertFalse(isAnagram("test", "text"))
        assertFalse(isAnagram("cat", "dog"))
        assertFalse(isAnagram("apple", "banana"))
    }

    @Test
    fun testIsAnagramWithEmptyStrings() {
        // Test case with empty strings
        assertTrue(isAnagram("", "")) // Two empty strings are considered anagrams
    }

    @Test
    fun testIsAnagramWithDifferentLengths() {
        // Test case with strings of different lengths
        assertFalse(isAnagram("listen", "silentt")) // Extra 't' in the second string makes it non-anagram
    }

    @Test
    fun testIsAnagramWithWhitespace() {
        // Test case with strings containing whitespace
        assertTrue(isAnagram("a gentleman", "elegant man"))
        assertTrue(isAnagram("hello world", "world hello")) // Extra space in the second string still makes it an anagram
    }
}