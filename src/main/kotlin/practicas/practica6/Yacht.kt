package practicas.practica6

import kotlin.random.Random


fun main() {
    val tirada = Array(5) { Random.nextInt(1, 7)  }
    mostrarTirada(tirada)
    print("Elija una categoria: ")
    val categoria = readln()

    val puntuacion = calcularPuntuacion(tirada,categoria)
    println("La puntuacion total ha sido:      $puntuacion")
}

private fun calcularPuntuacion(tirada: Array<Int>, categoria: String): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun sonIguales(tirada: Array<Int>): Boolean {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun sumaDados(tirada: Array<Int>): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun esGranRecta(tirada: Array<Int>): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun esPocoRecto(tirada: Array<Int>) {
    throw UnsupportedOperationException("A implementar por el alumno")
}

private fun mostrarTirada(tirada: Array<Int>) {
    println(tirada.contentToString())
}

private fun contarAparacion(tirada: Array<Int>,  numeroABuscar:Int): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}