package practicas.practica23

class TareasViewModel {

    private var _uiState: TareasState = TareasState()
    val uiState: TareasState
        get() = _uiState

    fun agregarTarea(tarea: Tarea) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun completarTarea(id: Int) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun eliminarTarea(id: Int) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    private fun contarPendientes(tareas: List<Tarea>): Int {
        throw UnsupportedOperationException("A implementar por el alumno")
    }
}
