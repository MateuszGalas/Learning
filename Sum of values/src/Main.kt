fun summator(map: Map<Int, Int>): Int {
    return map.filter { it.key % 2 == 0 }.values.sum()
}