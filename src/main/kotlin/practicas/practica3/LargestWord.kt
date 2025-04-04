package practicas.practica3

fun main() {
    val cadena= "I love Codecademy"

    val mapaPalabras = getMapaPalabras(cadena)
    println(mapaPalabras)

    val pairMasLarga = getPalabraMasLarga(mapaPalabras)
    println("word: ${pairMasLarga.first} count: ${pairMasLarga.second}")
}

fun getMapaPalabras(cadena: String): Map<String, Int> {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun getPalabraMasLarga(mapaPalabras : Map<String, Int>): Pair<String, Int> {
    throw UnsupportedOperationException("A implementar por el alumno")
}