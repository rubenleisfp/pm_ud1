package teoria.colecciones

fun main() {
    val positiveNumbers = setOf(1, 2, 3, 4)
    println(positiveNumbers)

    val cities = setOf("Cali", "Armenia", "Cartagena", null)
    println(cities)

    val diamondCardsHand = setOf('A', 1, 2, 3, 'J', 'Q', 'K')
    println(diamondCardsHand)

    val setA = mutableSetOf(1, 6, 7, 10)
    val setB = mutableSetOf<Int>()
    println("A=$setA y B=$setB") // A=[1, 6, 7, 10] y B=[]

    setB.add(1) // [1]
    setB += 2   // [1,2]
    setB += 2   // [1,2]
    println(setB)
}