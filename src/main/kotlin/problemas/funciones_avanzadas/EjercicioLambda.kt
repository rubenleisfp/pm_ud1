fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
    return fn(v1, v2)
}


fun sumar(x1: Int, x2: Int) = x1 + x2


fun restar(x1: Int, x2: Int) = x1 - x2


fun multiplicar(x1: Int, x2: Int) = x1 * x2


fun dividir(x1: Int, x2: Int) = x1 / x2


fun main() {
    //Ejemplo hecho para la suma. Funcion anonima
    var resu1 = operar(10, 5, ::sumar)
    println("La suma de 10 y 5 es $resu1")
    //Ejemplo hecho para la suma. Expresión lambda
    resu1 = operar(10, 5, {x, y -> x + y})
    println("La suma de 10 y 5 es $resu1")
    //TODO a completar el resto por el estudiante para el resto de operaciones
}
