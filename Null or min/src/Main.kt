fun main() {
    val words = readln().split(" ")
    val word = mutableListOf<String>()
    words.forEach {
        if (it.first() in 'a'..'l') word.add(it)
    }

    println(word.minOfOrNull { it })
}