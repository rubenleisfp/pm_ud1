package practicas.practica11

fun main() {
    data class Producto(val nombre: String, val precio: Double, val esEcologico: Boolean)

    val productos = listOf(
        Producto("Manzana", 1.2, true),
        Producto("Leche", 0.9, false),
        Producto("Pan", 1.5, true),
        Producto("Coca-Cola", 1.0, false),
        Producto("Zanahoria", 0.6, true),
        Producto("Galletas", 1.8, false)
    )

    // 1. Productos ecológicos
    val ecologicos = productos.filter { it.esEcologico }
    println("Productos ecológicos:")
    ecologicos.forEach { println(it) }

    // 2. Productos con precio menor a 1.0€
    val baratos = productos.filter { it.precio < 1.0 }.map { it.nombre }
    println("\nProductos baratos (<1.0€):")
    baratos.forEach { println(it) }

    // 3. Precio medio de productos ecológicos
    val mediaEco = ecologicos.map { it.precio }.average()
    println("\nPrecio medio de los ecológicos: %.2f€".format(mediaEco))

    // 4. Lista de nombres en mayúsculas
    val nombresMayus = productos.map { it.nombre.uppercase() }
    println("\nNombres en mayúsculas:")
    nombresMayus.forEach { println(it) }
}
