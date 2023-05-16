fun main() {
    val title = readln()

    with(title) {
        println(
            if (this.length > 15) "OUR LONG SONG: " + this.uppercase() else "our short song: " + this.lowercase()
        )
    }
}