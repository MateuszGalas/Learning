class ChristmasTree(var color: String) {
    inner class TreeTopper(var color: String) {

        fun sparkle() {
            println(
                "The sparkling $color tree topper looks stunning on " +
                        "the ${this@ChristmasTree.color} Christmas tree!"
            )
        }
    }

    fun putTreeTopper(color: String) {
        val topper = TreeTopper(color)
        topper.sparkle()
    }
}