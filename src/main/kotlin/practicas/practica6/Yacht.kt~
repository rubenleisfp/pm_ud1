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
    var totalApariciones = 0
    var puntuacion = 0
    when (categoria) {
        "unos" -> puntuacion = 1 * contarAparacion(tirada,1)
        "dos"-> puntuacion = 2 * contarAparacion(tirada,2)
        "tres"-> puntuacion = 3 * contarAparacion(tirada,3)
        "cuatro" -> puntuacion = 4 * contarAparacion(tirada,4)
        "cinco" -> puntuacion = 5 * contarAparacion(tirada,5)
        "seis" -> puntuacion = 6 * contarAparacion(tirada,6)
        "poco_recto" -> esPocoRecto(tirada)
        "gran_recta" -> esGranRecta(tirada)
        "eleccion" -> sumaDados(tirada)
        "yacth" -> sonIguales(tirada)
        else -> print("Entrada inválida")
    }

    return puntuacion
}

fun sonIguales(tirada: Array<Int>): Boolean {
    var sonIguales = true
    for(i in tirada.indices -1){
        if  (tirada[i] != tirada[i+1]) {
            sonIguales = false
        }
    }
    return sonIguales
}

fun sumaDados(tirada: Array<Int>): Int {
    var sumaDados : Int = 0
    for(i in tirada.indices -1){
        sumaDados +=  tirada[i]
    }
    return sumaDados
}

fun esGranRecta(tirada: Array<Int>): Int {
    var sumaDados : Int = 0

    for(i in tirada.indices -1){
        sumaDados += sumaDados + tirada[i]
    }
    return sumaDados
}

fun esPocoRecto(tirada: Array<Int>) {

}

private fun mostrarTirada(tirada: Array<Int>) {
    println(tirada.contentToString())
}

private fun contarAparacion(tirada: Array<Int>,  numeroABuscar:Int): Int {
    var totalApariciones: Int = 0
    for(i in tirada.indices){
        if  (tirada[i] == numeroABuscar) {
            totalApariciones++
        }
    }
    return totalApariciones
}