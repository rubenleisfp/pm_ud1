package practicas.practica20
class CarritoViewModel {
    private var carritoState = CarritoState()

    fun agregarProducto(producto: Producto) {
        carritoState = carritoState.copy(
            productos = carritoState.productos + producto,
            total = carritoState.total + producto.precio
        )
    }

    fun removerProducto(producto: Producto) {
        if (producto in carritoState.productos) {
          carritoState = carritoState.copy(
              productos =carritoState.productos-producto,
              total =carritoState.total- producto.precio
          )
        }
    }

    fun obtenerEstado(): CarritoState {
        return carritoState
    }
}
