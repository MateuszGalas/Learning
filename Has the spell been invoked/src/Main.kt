fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.any { x -> x.equals("abracadabra", true) }

    println(res)
}