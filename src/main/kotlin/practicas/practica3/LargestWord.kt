package practicas.practica3

fun main() {
    val cadena= "I love Codecademy"

    val mapaPalabras = getMapaPalabras(cadena)
    println(mapaPalabras)

    val pairMasLarga = getPalabraMasLarga(mapaPalabras)
    println("word: ${pairMasLarga.first} count: ${pairMasLarga.second}")
}

fun getMapaPalabras(cadena: String): Map<String, Int> {
    val cadenaSplited = cadena.split(" ")
    val mapaPalabras  = cadenaSplited.map { it to it.length }.toMap()

    return mapaPalabras
}

fun getPalabraMasLarga(mapaPalabras : Map<String, Int>): Pair<String, Int> {
    var pair = Pair("",0)
    for ((key, value) in mapaPalabras.entries) {
        if (value > pair.second) {
            pair = Pair(key,value)
        }
    }
    return pair
}