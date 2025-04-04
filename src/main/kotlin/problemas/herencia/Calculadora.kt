package problemas.herencia

open class Calculadora(val valor1: Double, val valor2: Double ){
    fun sumar(): Double {
        return valor1 + valor2
    }

    fun restar(): Double {
        return valor1 - valor2
    }

    fun multiplicar(): Double {
        return valor1 * valor2
    }

    fun dividir(): Double {
        return valor1 / valor2
    }


}