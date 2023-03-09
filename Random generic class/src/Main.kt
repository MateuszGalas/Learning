class RandomClass<T, S, U>(val value1: T, val value2: S, val value3: U) {
    fun getFirstValue(): T {
        return value1
    }
    fun getSecondValue(): S {
        return value2
    }
    fun getThirdValue(): U {
        return value3
    }
}