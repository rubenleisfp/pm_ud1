package problemas.abstracta

class Rectangulo(val ladoMayor:Double, val ladoMenor: Double): Figura() {
    override fun calcularSuperficie(): Double {
        return ladoMayor * ladoMenor
    }

    override fun calcularPerimetro(): Double {
        return (ladoMayor * 2) + (ladoMenor * 2)
    }
}