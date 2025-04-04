package problemas.elementos_basicos


fun main() {
    val calculadora = Calculadora()
    val resultado = calculadora.suma(1,3);
    println(resultado)
}

class Calculadora() {
    fun suma(a: Int, b: Int): Int {
        //Implementa la operacion suma
        return a + b;
    }

    fun resta(a: Int, b: Int): Int {
        //Implementa la operacion suma
        return a - b;
    }

    fun multiplicacion(a: Int, b: Int): Int {
        //Implementa la operacion suma
        return a * b;
    }

    fun division(a: Int, b: Int): Int {
        //Implementa la operacion suma
        return a / b;
    }

    //Implementa el resto de metodos restar, dividir, multiplicar
}