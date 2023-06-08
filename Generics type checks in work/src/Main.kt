fun <T> countElementsOfType(list: List<Any>, clazz: Class<T>): Int {
    return list.count { it::class.simpleName == clazz.simpleName }
}