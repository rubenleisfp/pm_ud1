package problemas.map

class Inventario {
    private val inventario = mutableMapOf<String, Producto>()

    fun agregarProducto(id: String, producto: Producto) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun eliminarProducto(id: String) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun mostrarProductos() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun buscarProductoPorId(id: String): Producto? {
        throw UnsupportedOperationException("A implementar por el alumno")
    }
}