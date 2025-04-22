package practicas.practica23

data class TareasState(
    val tareas: List<Tarea> = emptyList(),
    val pendientes: Int = 0
)
