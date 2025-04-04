package problemas.colecciones.tienda

fun main() {
    val carrito = Carrito()

    // Agregar productos al carrito
    carrito.agregarProducto(Producto(1, "Camisa", 25.99))
    carrito.agregarProducto(Producto(2, "Pantalón", 39.99))
    carrito.agregarProducto(Producto(3, "Zapatos", 49.99))

    // Calcular y mostrar el total del carrito
    println("Productos en el Carrito:")
    for (producto in carrito.productos) {
        println("${producto.nombre} - ${producto.precio} €")
    }
    println("Total: ${carrito.calcularTotal()} €")
}