fun main() {
    testCaesarCipher()
}


fun caesarCipher(text: String, shift: Int): String {
    val shiftedText = text.map { c ->
        when {
            c.isLowerCase() -> ('a' + (c - 'a' + shift) % 26)
            c.isUpperCase() -> ('A' + (c - 'A' + shift) % 26)
            else -> c
        }
    }
    return shiftedText.joinToString("")
}


fun testCaesarCipher() {
    val plaintext = "Hello, World!"
    val shift = 3

    val ciphertext = caesarCipher(plaintext, shift)

    val expected = "Khoor, Zruog!"
    assert(ciphertext == expected) { "Encryption failed: Expected '$expected', but got '$ciphertext'" }

    val decrypted = caesarCipher(ciphertext, -shift)

    assert(decrypted == plaintext) { "Decryption failed: Expected '$plaintext', but got '$decrypted'" }

    println("All tests passed!")
}