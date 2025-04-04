package teoria.elementos_basicos

fun main() {
    val income = arrayOf<Double>(
        0.5, 2.5, 4.0, 5.0,
        4.5, 6.0, 7.6, 8.0,
        5.0, 6.4, 4.0, 9.1
    )

    println(income.contentToString())

    /**
     * Creates a new array with the specified size, where each element is calculated by calling the specified init function.
     * The function init is called for each array element sequentially starting from the first one. It should return the value for an array element given its index.
     */
    //Equivalente
    val negativeNumbers = Array(10) { x -> x+1 }
    //val negativeNumbers = Array(10) { -(it + 1) }
    println(negativeNumbers.joinToString())

    val planets1 = arrayOfNulls<String>(8)

    val planets = arrayOfNulls<String>(8)
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"

    println(planets.contentToString())

    for(i in planets.indices){
        println("${planets[i]} está en la posición ${i+1}")
    }

    /*
    for (i in 0 until planets.size) {
        println("${planets[i]} está en la posición ${i + 1}")
    }
    planets.forEachIndexed { i, v ->
        println("$v está en la posición ${i+1}")
    }
    */
}