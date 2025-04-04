package problemas.colecciones.gestor_usuario



class GestorUsuarios {
    private val usuarios: MutableSet<Usuario> = mutableSetOf()

    fun agregarUsuario(usuario: Usuario): Boolean {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun mostrarUsuarios() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun buscarUsuarioPorEmail(email: String): Usuario? {
        throw UnsupportedOperationException("A implementar por el alumno")
    }


}
