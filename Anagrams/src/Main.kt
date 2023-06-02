fun isAnagram(word1: String, word2: String): Boolean {
    val list1 = word1.toList().filter { it != ' ' }
    val list2 = word2.toList().filter { it != ' ' }

    return list1.containsAll(list2) && list1.size == list2.size
}
