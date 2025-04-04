package practicas.practica22

fun main() {
    val viewModel = CitaViewModel()

    viewModel.agregarCita(1, "Carlos", "10:00 AM")
    viewModel.agregarCita(2, "Ana", "11:00 AM")

    println(viewModel.obtenerCitas()) // Lista inicial

    viewModel.confirmarCita(1)
    println(viewModel.obtenerCitas()) // Carlos tiene su cita confirmada

    viewModel.cancelarCita(2)
    println(viewModel.obtenerCitas()) // Ana ha sido eliminada
}