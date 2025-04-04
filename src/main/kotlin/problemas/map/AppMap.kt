package problemas.map

fun main() {
    val inventario = Inventario()

    // Agregar productos
    inventario.agregarProducto( "101", Producto("Laptop", 999.99))
    inventario.agregarProducto( "102", Producto("Mouse", 19.99))
    inventario.agregarProducto("103", Producto("Teclado", 49.99))

    // Mostrar todos los productos
    inventario.mostrarProductos()

    // Actualizar precio de un producto
    inventario.actualizarPrecio( "102", 24.99)

    // Buscar un producto por ID
    inventario.buscarProductoPorId("101")

    // Eliminar un producto
    inventario.eliminarProducto("103")

    // Mostrar todos los productos después de eliminar
    inventario.mostrarProductos()

    // Intentar buscar un producto que no existe
    inventario.buscarProductoPorId( "999")
}
