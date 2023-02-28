fun findLongestByIterator(strIterator: Iterator<String>): String {
    var longest = ""
    while (strIterator.hasNext()) {
        val next = strIterator.next()
        if (next.length > longest.length) longest = next
    }
    return longest
}

fun main() {
    val words: List<String> = readLine()!!.split("\\s+".toRegex())
    println(findLongestByIterator(words.iterator()))
}