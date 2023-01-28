import java.time.LocalDate

fun daysForward(date: String, days: Int) {
    println(LocalDate.parse(date).plusDays(days.toLong()))
}

fun main() {
    val date = readLine()!!
    val days = readLine()!!.toInt()
    daysForward(date, days)
}