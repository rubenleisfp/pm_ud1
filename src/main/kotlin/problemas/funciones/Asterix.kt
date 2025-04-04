package problemas.funciones

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Introduzca un número: ")
    val n = scanner.nextInt()

    imprimirCuadradoAsteriscos(n)
}

fun imprimirCuadradoAsteriscos(n: Int) {
    for (i in 1..n) {
        for (j in 1..n) {
            print("* ")
        }
        println() // Salto de línea después de cada fila
    }
}
