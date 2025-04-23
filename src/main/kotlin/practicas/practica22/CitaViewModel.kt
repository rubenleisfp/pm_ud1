package practicas.practica22

class CitaViewModel {
    private var citas: List<CitaState> = emptyList()

    fun agregarCita(id: Int, cliente: String, hora: String) {
        citas = citas + CitaState(id, cliente, hora)
    }

    fun confirmarCita(id: Int) {
        val nuevasCitas = mutableListOf<CitaState>()
        for (cita in citas) {
            if (cita.id == id) {
                nuevasCitas.add(cita.copy(confirmada = true))
            } else {
                nuevasCitas.add(cita)
            }
        }
        citas = nuevasCitas
    }

    fun cancelarCita(id: Int) {
        //citas = citas.filter { it.id != id }
        val nuevasCitas = mutableListOf<CitaState>()
        for (cita in citas) {
            if (cita.id != id) {
                nuevasCitas.add(cita)
            }
        }
        citas = nuevasCitas
    }

    fun obtenerCitas(): List<CitaState> = citas
}
