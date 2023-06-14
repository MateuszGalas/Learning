import java.io.File
import kotlin.random.Random
import kotlin.random.nextInt

/*
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

fun addTen(number: Int): Int {
    return number + 10
}

fun changeNumber(changeFunction: (Int) -> Int, number: Int) {
    val newNumber = changeFunction(number)
    print("$newNumber ")
}

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toList()
    var numberFun: (Int) -> Int
    for (number in numbers) {
        numberFun = if (number % 2 == 0) ::addTen else ::multiplyByTwo

        changeNumber(numberFun, number)
    }
}*/

fun main() {
    val file1 = File("file1.txt")
    val file2 = File("file2.txt")

    if (!file2.exists()) file2.createNewFile() else file2.writeText("")
    val max = if (!file1.exists()) {
        file1.createNewFile()
        val randomNumber = Random.nextInt(100, 200)
        file1.writeText("$randomNumber")
        randomNumber
    } else {
        file1.readLines()[0].toInt()
    }

    for(i in 0..max) {
        if (i % 3 == 0 && i % 5 == 0) file2.appendText("FizzBuzz\n")
        else if (i % 3 == 0) file2.appendText("Fizz\n")
        else if (i % 5 == 0) file2.appendText("Buzz\n")
        else file2.appendText("$i\n")
    }
}