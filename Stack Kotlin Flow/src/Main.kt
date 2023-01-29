class MyStack<T>(data: List<T>) {
    private val items = data.toMutableList()

    fun push(data: T) { items.add(data) }
    fun pop(): T { return items.removeLast() }
}