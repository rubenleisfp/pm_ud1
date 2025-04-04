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
        throw UnsupportedOperationException("A implementar por el alumno")
    }

}