package practicas.practica22

class CitaViewModel {
    private var citas: List<CitaState> = emptyList()

    fun agregarCita(id: Int, cliente: String, hora: String) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun confirmarCita(id: Int) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun cancelarCita(id: Int) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun obtenerCitas(): List<CitaState> = citas
}
