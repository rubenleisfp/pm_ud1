package practicas.practica21

class UsuarioViewModel {
    private var usuarios: List<UsuarioState> = emptyList()

    fun agregarUsuario(id: Int, nombre: String) {
        usuarios = usuarios + UsuarioState(id, nombre)
    }

    fun cambiarEstadoUsuario(id: Int) {
        usuarios = usuarios.map { usuario ->
            if (usuario.id == id) usuario.copy(activo = !usuario.activo) else usuario
        }
    }

    fun obtenerUsuarios(): List<UsuarioState> = usuarios
}