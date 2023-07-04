fun solution(elements: Set<String>, element: String): MutableSet<String> {
    return elements.filter { it != element }.toMutableSet()
}