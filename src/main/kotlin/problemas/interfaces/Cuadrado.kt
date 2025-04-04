package problemas.interfaces

class Cuadrado(val lado: Int): Figura {


    override fun calcularSuperficie(): Int {
        return lado * lado
    }

    override fun calcularPerimetro(): Int{
        return lado * 4
    }
}