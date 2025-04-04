package practicas.practica20
class CarritoViewModel {
    private var uiState = CarritoState()

    fun agregarProducto(producto: Producto) {
        uiState = uiState.copy(
            productos = uiState.productos + producto,
            total = uiState.total + producto.precio
        )
    }

    fun removerProducto(producto: Producto) {
        if (producto in uiState.productos) {
            uiState = uiState.copy(
                productos = uiState.productos - producto,
                total = uiState.total - producto.precio
            )
        }
    }

    fun obtenerEstado(): CarritoState = uiState
}
