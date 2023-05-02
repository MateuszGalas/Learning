fun verificationCode(): String {
    val letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"
    var code = ""

    repeat(10) {
        code += letters[Random.nextInt(letters.length)]
    }
    return code
}