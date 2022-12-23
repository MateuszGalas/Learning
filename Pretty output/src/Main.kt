data class Comment(val id: Int, val body: String, val author: String) {
    override fun toString(): String {
        return "Author: $author; Text: $body"
    }
}

fun printComments(commentsData: MutableList<Comment>) {
    for (i in commentsData) {
        println(i)
    }
}
