data class User(val name: String, val age: Int, val email: String)

class UserComparator : Comparator<User> {
    override fun compare(o1: User, o2: User): Int {
        val ageCompare = o1.age.compareTo(o2.age)
        return if (ageCompare != 0) ageCompare else o1.name.compareTo(o2.name)
    }
}