fun findPrimes(n : Int): List<Int> {
    val list = mutableListOf<Int>()
    loop@ for (i in 2..n) {
        for (j in 2 until i) {
            if (i % j == 0) continue@loop
        }
        list.add(i)
    }
    return list
}