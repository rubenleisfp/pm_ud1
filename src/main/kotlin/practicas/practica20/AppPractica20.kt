package practicas.practica20

fun main() {
    val viewModel = CarritoViewModel()
    val producto1 = Producto("Laptop", 1200.0)
    val producto2 = Producto("Mouse", 25.0)

    viewModel.agregarProducto(producto1)
    viewModel.agregarProducto(producto2)
    println(viewModel.obtenerEstado()) // Ver estado actualizado

    viewModel.removerProducto(producto1)
    println(viewModel.obtenerEstado()) // Ver estado después de remover
}