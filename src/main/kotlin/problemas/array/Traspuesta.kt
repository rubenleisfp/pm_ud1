package problemas.array

fun traspuesta(matriz: Array<IntArray>): Array<IntArray> {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    println("Matriz original:")
    imprimirMatriz(matriz)
    val matrizTraspuesta = traspuesta(matriz)

    println("Matriz traspuesta:")
    imprimirMatriz(matrizTraspuesta)
}

