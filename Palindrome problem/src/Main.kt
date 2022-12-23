fun isReversed(pair: Pair<String, String>): Triple<String, String, Boolean> {
    return Triple(pair.first, pair.second, pair.first.lowercase() == pair.second.lowercase().reversed())
}
