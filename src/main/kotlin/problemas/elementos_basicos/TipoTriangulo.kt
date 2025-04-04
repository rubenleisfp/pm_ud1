package problemas.elementos_basicos

fun tipoTriangulo(lado1: Int, lado2: Int, lado3: Int): String {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun main() {
    val lado1 = 5
    val lado2 = 5
    val lado3 = 5

    val tipo = tipoTriangulo(lado1, lado2, lado3)
    println("El triángulo con lados $lado1, $lado2 y $lado3 es: $tipo")
}
