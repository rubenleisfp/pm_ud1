package problemas.colecciones.tienda_avanzada

class Carrito {
    val productos: MutableList<Producto> = mutableListOf()

    fun agregarProducto(producto: Producto) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun calcularTotal(): Double {
        throw UnsupportedOperationException("A implementar por el alumno")
    }
}