import kotlinx.datetime.*

fun printDate(date: String) {
    val instant = date.toLocalDate()
    println("${instant.dayOfWeek}, ${instant.month} ${instant.dayOfMonth}, ${instant.year}")
}

fun main() {
    val date = readln()
    printDate(date)
}