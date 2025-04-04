package problemas.array

fun sumaArray(array: IntArray): Int {
    var suma = 0
    for (i in array.indices) {
        suma += array[i]
    }
    return suma
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val resultado = sumaArray(array)
    println("La suma de los elementos del array es: $resultado")
}
