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
    val contadorLetras: MutableMap<Char, Int> = actualizarContadorLetra(texto, nombrePila)
    return calcularTotalPuntos(contadorLetras)
}

/**
 * Actualiza el contador de apariciones encontradas de cada letra
 */
private fun actualizarContadorLetra(
    texto: String,
    nombrePila: String
): MutableMap<Char, Int> {
    val contadorLetras: MutableMap<Char, Int> = mutableMapOf()
    for (c in texto) {
        var letraMayuscula = c.uppercaseChar()
        when (letraMayuscula) {
            in nombrePila -> {
                actualizarContador(letraMayuscula, contadorLetras)
                //println("Encontrado $c")
            }
            //else -> println("No encontrado $c")
        }
    }
    return contadorLetras
}

/**
 * Calcula el total de letras encontradas en el texto
 */
private fun calcularTotalPuntos(contadorLetras: MutableMap<Char, Int>): Int {
    var totalPuntos: Int = 0
    contadorLetras.forEach { entry ->
        println("${entry.key} : ${entry.value}")
        totalPuntos += entry.value
    }
    return totalPuntos
}

/**
 * Suma 1 a la letras encontrada en el mapa
 */
fun actualizarContador(letraEncontrada : Char,  contadorLetras: MutableMap<Char, Int> = mutableMapOf()) {
    if (contadorLetras.containsKey(letraEncontrada)) {
        contadorLetras.merge(letraEncontrada, 1, Int::plus)
    }else {
        contadorLetras[letraEncontrada] = 1
    }
}