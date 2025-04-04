package problemas.colecciones.loteria

fun generarCarton(carton: MutableSet<Int>) {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun generarSorteo(bolillero: MutableSet<Int>) {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun verificarTriunfo(carton: MutableSet<Int>, bolillero: MutableSet<Int>) {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun main(args: Array<String>) {
    val carton: MutableSet<Int> = mutableSetOf()
    generarCarton(carton)
    println("Carton de lotería generado")
    println(carton)
    val bolillero: MutableSet<Int> = mutableSetOf()
    generarSorteo(bolillero)
    println("Numeros del sorteo")
    println(bolillero)
    verificarTriunfo(carton, bolillero)
}