fun findSerialNumberForGame(listGames: List<String>) {
    var game: String = ""
    val searchedGame = readln()
    listGames.forEach { if (it.matches("""${searchedGame}.+""".toRegex())) game = it }
    val data = game.split("@")
    println("Code for Xbox - ${data[1]}, for PC - ${data[2]}")
}