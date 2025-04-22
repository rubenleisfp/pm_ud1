package practicas.practica23

fun main() {
    val viewModel = TareasViewModel()

    viewModel.agregarTarea(Tarea(id = 1, descripcion = "Estudiar para el examen"))
    viewModel.agregarTarea(Tarea(id = 2, descripcion = "Sacar al perro"))
    viewModel.agregarTarea(Tarea(id = 3, descripcion = "Comprar pan"))

    println(viewModel.uiState)

    viewModel.completarTarea(2)
    viewModel.eliminarTarea(3)

    println(viewModel.uiState)
}
