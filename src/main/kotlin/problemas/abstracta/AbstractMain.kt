package problemas.abstracta



fun main() {
    val circulo = Circulo(2.0)
    circulo.tituloResultado()
    println("Perimetro del circulo : ${circulo.calcularPerimetro()}")
    println("Superficie del circulo : ${circulo.calcularSuperficie()}")
    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perimetro del rectangulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${rectangulo1.calcularSuperficie()}")
}