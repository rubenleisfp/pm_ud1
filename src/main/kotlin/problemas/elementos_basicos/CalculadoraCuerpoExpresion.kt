package problemas.elementos_basicos


fun main() {
    val calculadoraCuerpoExpresion = CalculadoraCuerpoExpresion();
    calculadoraCuerpoExpresion.saludar("Natalia")
    calculadoraCuerpoExpresion.saludar("Ruben", "Sr.")
}

class CalculadoraCuerpoExpresion {

    // Funciones para operaciones básicas con cuerpo de expresión
    fun sumar(a: Int, b: Int): Int = a + b

    fun restar(a: Int, b: Int): Int = a - b

    fun multiplicar(a: Int, b: Int): Int = a * b

    fun dividir(a: Int, b: Int): Int = a / b

    // Función para saludar al usuario
    fun saludar(nombre: String, tratamiento: String = "Sra."): String =
        "Buenos días $tratamiento $nombre"
}

