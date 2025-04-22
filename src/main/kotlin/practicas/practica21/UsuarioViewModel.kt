package practicas.practica21

class UsuarioViewModel {
    private var usuarios: List<UsuarioState> = emptyList()

    fun agregarUsuario(id: Int, nombre: String) {
        usuarios = usuarios + UsuarioState(id, nombre)
    }

    fun cambiarEstadoUsuario(id: Int) {
        val nuevosUsuarios = mutableListOf<UsuarioState>()
        for (usuario in usuarios) {
            if (usuario.id == id) {
                nuevosUsuarios.add(usuario.copy(activo = !usuario.activo))
            } else {
                nuevosUsuarios.add(usuario)
            }
        }
        usuarios = nuevosUsuarios
    }
    fun obtenerUsuarios(): List<UsuarioState> = usuarios
}