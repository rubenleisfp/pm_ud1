package problemas.abstracta

class Circulo(val radio: Double): Figura() {


    override fun calcularSuperficie(): Double {
        return  Math.PI * radio;
    }

    override fun calcularPerimetro(): Double{
        return 2 * Math.PI * radio;
    }
}