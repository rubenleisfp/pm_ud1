package problemas.string

// Función que genera un acrónimo a partir de una frase
fun generarAcronimo(frase: String): String {
    var acronimo = ""  // Inicializamos una cadena vacía para almacenar el acrónimo

    // Dividimos la frase en palabras
    val palabras = frase.split(" ")

    // Iteramos sobre cada palabra en la frase
    for (palabra in palabras) {
        // Agregamos la primera letra de cada palabra en mayúscula al acrónimo
        if (palabra.isNotEmpty()) {
            acronimo += palabra[0].uppercaseChar()
        }
    }

    return acronimo  // Devolvemos el acrónimo generado
}

// Función principal para probar la funcionalidad
fun main() {
    val frase = "Los informáticos aman los acrónimos"
    val acronimo = generarAcronimo(frase)
    println("Frase: $frase")
    println("Acrónimo: $acronimo")
}
