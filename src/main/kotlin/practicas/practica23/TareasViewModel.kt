package practicas.practica23

class TareasViewModel {

    private var _uiState: TareasState = TareasState()
    val uiState: TareasState
        get() = _uiState

    fun agregarTarea(tarea: Tarea) {
        /* VERSION CON LAMBDAS
        val nuevasTareas = _uiState.tareas + tarea
        val nuevasPendientes = nuevasTareas.count { !it.completada }
        _uiState = _uiState.copy(tareas = nuevasTareas, pendientes = nuevasPendientes)
         */

        val nuevasTareas = mutableListOf<Tarea>()
        for (t in _uiState.tareas) {
            nuevasTareas.add(t)
        }
        nuevasTareas.add(tarea)

        val nuevasPendientes = contarPendientes(nuevasTareas)
        _uiState = _uiState.copy(tareas = nuevasTareas.toList(), pendientes = nuevasPendientes)
    }

    fun completarTarea(id: Int) {
        /**
         VERSION CON LAMBDAS
        val nuevasTareas = _uiState.tareas.map {
            if (it.id == id) it.copy(completada = true) else it
        }
        val nuevasPendientes = nuevasTareas.count { !it.completada }
        _uiState = _uiState.copy(tareas = nuevasTareas, pendientes = nuevasPendientes)
        **/

        val nuevasTareas = mutableListOf<Tarea>()
        for (t in _uiState.tareas) {
            if (t.id == id) {
                nuevasTareas.add(t.copy(completada = true))
            } else {
                nuevasTareas.add(t)
            }
        }

        val nuevasPendientes = contarPendientes(nuevasTareas)
        _uiState = _uiState.copy(tareas = nuevasTareas.toList(), pendientes = nuevasPendientes)
    }

    fun eliminarTarea(id: Int) {

        /* VERSION CON LAMBDAS
        val nuevasTareas = _uiState.tareas.filterNot { it.id == id }
        val nuevasPendientes = nuevasTareas.count { !it.completada }
        _uiState = _uiState.copy(tareas = nuevasTareas, pendientes = nuevasPendientes)
        */
        val nuevasTareas = mutableListOf<Tarea>()
        for (t in _uiState.tareas) {
            if (t.id != id) {
                nuevasTareas.add(t)
            }
        }
        val nuevasPendientes = contarPendientes(nuevasTareas)
        _uiState = _uiState.copy(tareas = nuevasTareas.toList(), pendientes = nuevasPendientes)

    }

    private fun contarPendientes(tareas: List<Tarea>): Int {
        var contador = 0
        for (t in tareas) {
            if (!t.completada) {
                contador++
            }
        }
        return contador
    }
}
