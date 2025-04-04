package practicas.practica22

class CitaViewModel {
    private var citas: List<CitaState> = emptyList()

    fun agregarCita(id: Int, cliente: String, hora: String) {
        citas = citas + CitaState(id, cliente, hora)
    }

    fun confirmarCita(id: Int) {
        citas = citas.map { cita ->
            if (cita.id == id) cita.copy(confirmada = true) else cita
        }
    }

    fun cancelarCita(id: Int) {
        citas = citas.filter { it.id != id }
    }

    fun obtenerCitas(): List<CitaState> = citas
}
