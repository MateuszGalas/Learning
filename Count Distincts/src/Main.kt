fun countDistinctWords(list : List<String>): Int {
    val words = list.flatMap { it.split(" " ) }.map { it.lowercase() }.toSet()
    return words.count()
}