package problemas.string

// Función que genera un acrónimo a partir de una frase
fun generarAcronimo(frase: String): String {
    throw UnsupportedOperationException("A implementar por el alumno")
}

// Función principal para probar la funcionalidad
fun main() {
    val frase = "Los informáticos aman los acrónimos"
    val acronimo = generarAcronimo(frase)
    println("Frase: $frase")
    println("Acrónimo: $acronimo")
}
