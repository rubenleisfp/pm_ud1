package practicas.practica20
class CarritoViewModel {
    private var uiState = CarritoState()

    fun agregarProducto(producto: Producto) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun removerProducto(producto: Producto) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun obtenerEstado(): CarritoState = uiState
}
