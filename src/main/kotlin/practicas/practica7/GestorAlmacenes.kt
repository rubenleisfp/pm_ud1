package practicas.practica7

class GestorAlmacenes {

    var productosEnAlmacen = mutableMapOf<String, MutableList<ProductoStock>>()

    init {
        iniciarAlmacenes()
    }

    fun iniciarAlmacenes() {
        productosEnAlmacen["ZGZ"]  = mutableListOf()
        productosEnAlmacen["BCN"]  = mutableListOf()
        productosEnAlmacen["LCG"]  = mutableListOf()

    }

    fun mostrarAlmacenes() {
        println("Almacenes: ${productosEnAlmacen.keys}")
    }

    fun mostrarProductos(almacen: String) {
        val productos = productosEnAlmacen[almacen] ?: emptyList()
        println("Productos en el almacen $almacen:")
        productos.forEach { println(it) }
    }

    fun obtenerProductos(almacen: String): List<ProductoStock> {
        return productosEnAlmacen[almacen] ?: emptyList()
    }

    fun agregarProducto(almacen: String, producto: Producto, stock: Int) {
        val productos = productosEnAlmacen.getOrPut(almacen) { mutableListOf() }
        productos.add(ProductoStock(producto, stock))
    }

    fun mostrarProductosPorAlmacen() {
        for ((almacen, productos) in productosEnAlmacen) {
            println("Productos en el almacen $almacen:")
            productos.forEach { println(it) }
        }
    }

    fun obtenerPrecioTotal(almacen: String): Double {
        val productos = productosEnAlmacen[almacen] ?: emptyList()
        return productos.sumOf { it.producto.precio * it.stock }
    }
}