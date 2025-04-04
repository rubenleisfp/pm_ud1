package practicas.practica21

class UsuarioViewModel {
    private var usuarios: List<UsuarioState> = emptyList()

    fun agregarUsuario(id: Int, nombre: String) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun cambiarEstadoUsuario(id: Int) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun obtenerUsuarios(): List<UsuarioState> = usuarios
}