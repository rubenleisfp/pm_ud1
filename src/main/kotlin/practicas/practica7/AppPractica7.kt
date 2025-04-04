package practicas.practica7


fun main() {

    val inventarioCentral = InventarioCentral()
    val gestorAlmacenes = GestorAlmacenes()

    println("Bienvenido al Menu de la Practica 7")
    println("1. Mostrar todos los productos del inventario central")
    println("2. Obtener un producto del inventario central por su id")
    println("3. Obtener todos los almacenes")
    println("4. Mostrar productos de los almacenes")
    println("5. Mostrar el coste total de un almacen")
    println("6. Agregar producto a un almacen")

    println("6. Salir")

    var opcion: Int

    do {
        println("Seleccione una opción:")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                inventarioCentral.mostrarTodosLosProductos()
            }
            2 -> {
                print("Dime el id del producto: ")
                val id = readLine()!!.toInt()
                val producto = inventarioCentral.obtenerProducto(id)
                if (producto == null) {
                    println("Producto no encontrado")
                } else {
                    println("ID: ${producto.id}, Nombre: ${producto.nombre}, Precio: ${producto.precio}")
                }
            }
            3 -> {
                gestorAlmacenes.mostrarAlmacenes()
            }
            4 -> {
                gestorAlmacenes.mostrarProductosPorAlmacen()
            }
            5 -> {
                print("Dime el nombre del almacen: ")
                val almacen = readLine()!!
                val precioTotal = gestorAlmacenes.obtenerPrecioTotal(almacen)
                println(precioTotal)

            }
            6 -> {
                print("Dime el nombre del almacen: ")
                val almacen = readLine()!!
                print("Dime el id del producto: ")
                val id = readLine()!!.toInt()
                val producto = inventarioCentral.obtenerProducto(id)
                if (producto == null) {
                    println("Producto no encontrado")
                } else {
                    print("Dime el stock del producto: ")
                    val stock = readLine()!!.toInt()
                    gestorAlmacenes.agregarProducto(almacen, producto, stock)
                }
            }

            10 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción no válida")
            }
        }
    } while (opcion != 10)
}