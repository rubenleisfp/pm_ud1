package problemas.array

fun traspuesta(matriz: Array<IntArray>): Array<IntArray> {
    val filas = matriz.size
    val columnas = matriz[0].size
    val traspuesta = Array(columnas) { IntArray(filas) }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            traspuesta[j][i] = matriz[i][j]
        }
    }

    return traspuesta
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor ")
        }
        println()
    }
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

