data class QuizBox<T>(val hiddenItem: T) {
    var isChanged = false
    var item: T = hiddenItem
        get() {
            println("You asked for the item")
            return field
        }
        set(value) {
            field = value
            isChanged = true
            println("You changed the item")
        }
}