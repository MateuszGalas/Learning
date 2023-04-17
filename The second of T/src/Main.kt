fun solution(names: List<String>): Int {
    for (i in 1..names.lastIndex step 2) {
        if (names[i].first() == 'T') return i
    }
    return 0
}