package problemas.colecciones.tienda

class Carrito {
    val productos: MutableList<Producto> = mutableListOf()

    fun agregarProducto(producto: Producto) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun calcularTotal(): Double {
        throw UnsupportedOperationException("A implementar por el alumno")
    }
}