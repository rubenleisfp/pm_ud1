package teoria.colecciones

fun imprimir(productos: Map<String, Double>) {
    for((clave, valor) in productos)
        println("$clave tiene un precio $valor")
    println();
}

fun cantidadPrecioMayor20(productos: Map<String, Double>) {
    val cant = productos.count{ it.value > 20}
    println("Cantidad de productos con un precio superior a 20: $cant")
}

fun main(args: Array<String>) {
    val productos: Map<String, Double> = mapOf("papas" to 12.0,
        "manzanas" to 26.0,
        "peras" to 31.0,
        "mandarinas" to 15.0,
        "pomelos" to 28.0)
    imprimir(productos)
    cantidadPrecioMayor20(productos)
}