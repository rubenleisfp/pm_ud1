package teoria.elementos_basicos


fun main() {
    val calculadora = CalculadoraInline()

    val res:Int = calculadora.sumar(5,3)
    println("res $res")
    calculadora.saludar(edad = 40)
}

class CalculadoraInline() {
    fun sumar(x1: Int, x2: Int) = x1 + x2


    fun restar(x1: Int, x2: Int) = x1 - x2


    fun multiplicar(x1: Int, x2: Int) = x1 * x2


    fun dividir(x1: Int, x2: Int) = x1 / x2


    fun saludar(nombre: String = "Ruben", edad:Int)= println("La edad de $nombre es $edad")

}