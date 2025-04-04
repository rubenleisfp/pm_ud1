package clases

import problemas.herencia.Calculadora

/**
 * Ejercicio herencia
 */

class CalculadoraCientifica(valor1: Double, valor2: Double): Calculadora(valor1, valor2) {
    fun cuadrado():Double {
        return  valor1 * valor1
    }

    fun raiz():Double {
        return Math.sqrt(valor1)
    }
}

