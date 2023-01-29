class Holder(var value: Any) {
    fun set(newValue: Any) {
        value = newValue
    }

    fun get(): Any {
        return value
    }
}

fun main() {
    val holder: Holder = Holder(0)
    holder.set(256)

    val value: Int = holder.get() as Int

    println(value)
}
