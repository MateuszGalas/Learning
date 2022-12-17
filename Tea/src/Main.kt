// Implement the class BlackTea which is inherited from the class Tea. The class should have a public constructor with
// two arguments, cost, and volume.
//
// To complete the task, override the toString() method; it should return the following string pattern:
//
// BlackTea{cost=val_cost, volume=val_volume}
//
// where val_cost, val_volume are the values of the class parameters.

open class Tea(val cost: Int, val volume: Int) {
    override fun toString(): String {
        return "cost=$cost, volume=$volume"
    }
}

class BlackTea(cost: Int, volume: Int) : Tea(cost, volume) {
    override fun toString(): String {
        return "BlackTea{${super.toString()}}"
    }
}