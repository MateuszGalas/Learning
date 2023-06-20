
//val passwordRegex = """^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*\W).{8,}$""".toRegex()
fun main() {
    while (true) {
        println("Put a password")
        val password = readln()
        if (password.length >= 8
            && password.contains("""[a-z]+""".toRegex())
            && password.contains("""[A-Z]+""".toRegex())
            && password.contains("""[0-9]+""".toRegex())
            && password.contains("""\W+""".toRegex())) {
            println("Great password")
            break
        } else {
            println("password should contain minimum length of 8 characters, contains at least one uppercase letter, " +
                    "one lowercase letter, one digit, and one special character.")
        }
    }
}