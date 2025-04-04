package problemas.elementos_basicos

fun main(argumento: Array<String>) {
    val calculadora = CalculadoraNulable ()
    println(calculadora.suma(1,3))
    println(calculadora.suma(null,3))
    println(calculadora.suma(3,null))
    println(calculadora.suma(null,null))
}

class CalculadoraNulable() {
    fun suma(a: Int?, b:Int?):Int{
        val valorA = a ?: 0  // Si 'a' es nulo, se asigna 0
        val valorB = b ?: 0  // Si 'b' es nulo, se asigna 0
        return valorA + valorB
    }

}