package problemas.elementos_basicos

fun main() {
    // Change this value to generate the multiplication
    //  table for a different number

    val number = 3

    println("Tabla del: $number:")

    val total = generateMultiplicationTable(number)
    println("Suma total $total")
}

fun generateMultiplicationTable(number: Int): Int {
    var result: Int=0
    var total: Int = 0;
    for (i in 1..10) {
        result = number * i
        total += result
        println("$number * $i = $result")
    }
    return total
}

