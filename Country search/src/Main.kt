fun main() {
    val map = mapOf(
        "NG" to "Nigeria", 
        "AU" to "Australia", 
        "CA" to "Canada", 
        "BG" to "Bulgaria", 
        "DE" to "Germany"
    )
    val mapIterator = map.iterator()
    val input = readln().uppercase()
    
    while (mapIterator.hasNext()) {
        val next = mapIterator.next()
        if (next.key == input) {
            println(next.value)
            break
        }
    }
}
