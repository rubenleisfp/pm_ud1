package practicas.practica21

fun main() {
    val viewModel = UsuarioViewModel()

    viewModel.agregarUsuario(1, "Alice")
    viewModel.agregarUsuario(2, "Bob")

    println(viewModel.obtenerUsuarios()) // Lista original

    viewModel.cambiarEstadoUsuario(1)
    println(viewModel.obtenerUsuarios()) // Alice ahora está inactiva
}