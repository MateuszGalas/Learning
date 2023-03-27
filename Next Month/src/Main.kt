import kotlinx.datetime.*

fun nextMonth(date: String): String {
    val data = Instant.parse(date)
    val period = DateTimePeriod(0, 1)
    return data.plus(period, TimeZone.UTC).toString()
}

fun main() {
    val date = readln()
    println(nextMonth(date))
}