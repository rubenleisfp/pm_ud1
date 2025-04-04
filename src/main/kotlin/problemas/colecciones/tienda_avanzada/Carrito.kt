package problemas.colecciones.tienda_avanzada

class Carrito {
    val productos: MutableList<Producto> = mutableListOf()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun calcularTotal(): Double {
        var total = 0.0
        for (producto in productos) {
            total += producto.precio
        }
        return total
    }
}