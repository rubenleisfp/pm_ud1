package practicas.practica7

class InventarioCentral {

    var productos = mutableMapOf<Int,Producto>()


    init {
        rellenarInventario()
    }

    fun rellenarInventario() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun obtenerProducto(id: Int): Producto? {
        return productos[id]
    }

    fun mostrarTodosLosProductos() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

}