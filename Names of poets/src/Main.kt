fun main() {
    var poet: String? = readln()

    val coolScope = "Our poet is $poet\n${poet?.lowercase()?.count { it == 'a' } ?: 0}"

    println(coolScope)
}