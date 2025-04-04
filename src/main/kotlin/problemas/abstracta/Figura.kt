package problemas.abstracta

abstract class Figura {
    abstract fun calcularSuperficie(): Double
    abstract fun calcularPerimetro(): Double
    fun tituloResultado() {
        println("Datos de la figura")
    }
}