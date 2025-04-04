fun main() {
    var puntuacion : Int = scoreWord("MOTOR")
    println("La puntuacion para su palabra es: $puntuacion" )
}

fun scoreWord(word: String): Int {
    var puntuacion : Int = 0
    for(char in word){
        puntuacion +=  scoreLetter(char)
    }
    return puntuacion
    //return word.sumOf { scoreLetter(it) }
}

fun scoreLetter(c: Char): Int =
    when (c.uppercaseChar()) {
        in "AEIOULNRST" -> 1
        in "DG" -> 2
        in "BCMP" -> 3
        in "FHVWY" -> 4
        'K' -> 5
        in "JX" -> 8
        in "QZ" -> 10
        else -> 0
    }


