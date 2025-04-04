package practicas.practica7

class InventarioCentral {

    var productos = mutableMapOf<Int,Producto>()


    init {
        rellenarInventario()
    }

    fun rellenarInventario() {
        var camisa = Producto(1,"Camisa", 25.0)
        var pantalones = Producto(2,"Pantalones", 40.0)
        var zapatos = Producto(3,"Zapatos", 100.0)
        var camiseta = Producto(4,"Camiseta", 15.50)
        productos[1] = camisa
        productos[2] = pantalones
        productos[3] = zapatos
        productos[4] = camiseta
    }

fun obtenerProducto(id: Int): Producto? {
    return productos[id]
}

fun mostrarTodosLosProductos() {
    for ((id, producto) in productos) {
        println("ID: $id, Nombre: ${producto.nombre}, Precio: ${producto.precio}")
    }
}

}