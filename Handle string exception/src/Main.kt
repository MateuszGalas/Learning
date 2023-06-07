fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    println(
        try {
            word[index]
        } catch (e: IndexOutOfBoundsException) {
            "There isn't such an element in the given string, please fix the index!"
        }
    )

}