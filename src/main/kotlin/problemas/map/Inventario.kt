package problemas.map

class Inventario {
    private val inventario = mutableMapOf<String, Producto>()

    fun agregarProducto(id: String, producto: Producto) {
        if (inventario.containsKey(id)) {
            println("El producto con ID $id ya existe en el inventario.")
        } else {
            inventario[id] = producto
            println("Producto ${producto.nombre} agregado correctamente.")
        }
    }

    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        val producto = inventario[id]
        if (producto != null) {
            producto.precio = nuevoPrecio
            println("Precio del producto ${producto.nombre} actualizado a $$nuevoPrecio.")
        } else {
            println("Producto con ID $id no encontrado.")
        }
    }

    fun eliminarProducto(id: String) {
        if (inventario.remove(id) != null) {
            println("Producto con ID $id eliminado del inventario.")
        } else {
            println("Producto con ID $id no encontrado.")
        }
    }

    fun mostrarProductos() {
        if (inventario.isEmpty()) {
            println("El inventario está vacío.")
        } else {
            println("Productos en el inventario:")
            for ((id, producto) in inventario) {
                println("ID: $id, Nombre: ${producto.nombre}, Precio: $${producto.precio}")
            }
        }
    }

    fun buscarProductoPorId(id: String): Producto? {
        val producto = inventario[id]
        if (producto == null) {
            println("Producto con ID $id no encontrado.")
        } else {
            println("Producto encontrado: Nombre: ${producto.nombre}, Precio: $${producto.precio}")
        }
        return producto
    }
}