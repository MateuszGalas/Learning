fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.filterIndexed { index, s ->  s.length == 5 && index != 0 }

    println(res)
}