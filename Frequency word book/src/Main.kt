fun main() {
    readln().split(" ").groupingBy { it }.eachCount().forEach { println("${it.key} ${it.value}") }
}