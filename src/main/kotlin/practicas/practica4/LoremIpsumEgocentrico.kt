package practicas.practica4

import java.text.Normalizer

private val REGEX_UNACCENT = "\\p{InCombiningDiacriticalMarks}+".toRegex()

fun main() {
    var textoABuscar= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex " +
            "ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

    var nombrePila = "MIGUEL"
    nombrePila = nombrePila.unaccent()

    println("Nombre pila: $nombrePila")
    var totalPuntos = contarApariciones(textoABuscar, nombrePila)
    println("Total puntos: $totalPuntos")
}

/**
 * Elimina los acentos del string recibido
 */
fun CharSequence.unaccent(): String {
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    return REGEX_UNACCENT.replace(temp, "")
}

/**
 * Cuenta el numero de apariciones de las letras del nombrePila
 * en el texto recibido como argumento
 */
fun contarApariciones(texto: String, nombrePila: String): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}

/**
 * Actualiza el contador de apariciones encontradas de cada letra
 */
private fun actualizarContadorLetra(
    texto: String,
    nombrePila: String
): MutableMap<Char, Int> {
    throw UnsupportedOperationException("A implementar por el alumno")
}

/**
 * Calcula el total de letras encontradas en el texto
 */
private fun calcularTotalPuntos(contadorLetras: MutableMap<Char, Int>): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}

/**
 * Suma 1 a la letras encontrada en el mapa
 */
fun actualizarContador(letraEncontrada : Char,  contadorLetras: MutableMap<Char, Int> = mutableMapOf()) {
    throw UnsupportedOperationException("A implementar por el alumno")
}