package practicas.practica7

class GestorAlmacenes {

    var productosEnAlmacen = mutableMapOf<String, MutableList<ProductoStock>>()

    init {
        iniciarAlmacenes()
    }

    fun iniciarAlmacenes() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun mostrarAlmacenes() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun mostrarProductos(almacen: String) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun obtenerProductos(almacen: String): List<ProductoStock> {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun agregarProducto(almacen: String, producto: Producto, stock: Int) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun mostrarProductosPorAlmacen() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun obtenerPrecioTotal(almacen: String): Double {
        throw UnsupportedOperationException("A implementar por el alumno")
    }
}