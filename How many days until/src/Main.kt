import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import kotlin.math.absoluteValue

fun daysDifference(date1: String, date2: String): Int {
    val datetime1 = LocalDateTime.parse(date1 + "T00:00:00")
    val datetime2 = LocalDateTime.parse(date2 + "T00:00:00")
    return datetime1.until(datetime2, ChronoUnit.DAYS).toInt().absoluteValue
}

fun main() {
    val date1 = readLine()!!
    val date2 = readLine()!!
    println(daysDifference(date1, date2))
}