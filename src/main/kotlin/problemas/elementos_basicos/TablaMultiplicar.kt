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
    throw UnsupportedOperationException("A implementar por el alumno")
}

