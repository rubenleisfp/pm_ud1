package teoria.funciones_avanzadas

//Cuerpo de expresion
fun sumar(a: Int, b: Int): Int = a + b

//Funcion anonima
val sumaAnonima1 = fun(a: Int, b: Int): Int {
    return a + b
}
//Funcion anonima
val sumaAnonima2 = fun(a: Int, b: Int): Int {
    return a + b
}
//Funcion lambda
val sumaLambda = { a: Int, b: Int -> a + b }

fun ordenSuperior(a: Int, b: Int, funcion: (Int, Int) -> Int): Int {
    return funcion(a, b)
}

fun main() {
    println(sumar(1,2))
    println(sumaAnonima1(1,2))
    println(sumaAnonima2(1,2))
    println(sumaLambda(1,2))
    ordenSuperior(1,3,::sumar)
    ordenSuperior(1,3,{x,y->x-y})

    usoHabitualLambdasEnColecciones()
}

fun usoHabitualLambdasEnColecciones() {
    // Expresion lambda. La funcion no tiene cuerpo
    val suma = { a: Int, b: Int -> a + b }
    println(suma(5, 3))  // Output: 8

    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { a -> a*2}  // Duplicar cada número
    println(doubled)  // Output: [2, 4, 6, 8, 10]

    val nombreCompleto = { nombre: String, apellido: String -> "$nombre $apellido" }

    println(nombreCompleto("Laura", "Min"))
    println(nombreCompleto.invoke("Carlos", "Xhan"))

    var eCount = "develou.com".count({ caracter:Char -> caracter == 'e' })
    println("Total 'e': $eCount")

    // Omitir el tipo de datos
    eCount = "develou.com".count({ caracter -> caracter == 'e' })
    println("Total 'e': $eCount")

    // Un solo argumento, podemos usar it
    eCount = "develou.com".count({ it == 'e' })
    println("Total 'e': $eCount")

    print("Total 'e': $eCount")
}