package problemas.interfaces

/*
Ejercicio intefaces
 */

interface Figura {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado() {
        println("Datos de la figura")
    }
}




fun main() {
    val cuadrado1 = Cuadrado(10)
    cuadrado1.tituloResultado()
    println("Perimetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")
    val rectangulo1 = Rectangulo(10, 5)
    rectangulo1.tituloResultado()
    println("Perimetro del rectangulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${rectangulo1.calcularSuperficie()}")

    //Aqui aplicamos polimorfismo. Tenemos un objeto de tipo interfaz llamado figuraIndeterminada.
    //Este objeto se puede comportar de diversas formas, dependiendo de la instancia que tenga metida en su interior
    //En la linea 33 se comportará como un cuadrado y en la 34 se comportara como un rectangulo
    var figuraIndeterminada : Figura= cuadrado1;
    //figuraIndeterminada = rectangulo1;
    println("Perimetro de la figuraIndeterminada : ${figuraIndeterminada.calcularPerimetro()}")
    println("Superficie de la figuraIndeterminada : ${figuraIndeterminada.calcularSuperficie()}")
}