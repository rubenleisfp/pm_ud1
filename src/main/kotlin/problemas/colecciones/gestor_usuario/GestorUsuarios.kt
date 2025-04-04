package problemas.colecciones.gestor_usuario



class GestorUsuarios {
    private val usuarios: MutableSet<Usuario> = mutableSetOf()

    fun agregarUsuario(usuario: Usuario): Boolean {
        return if (usuarios.any { it.email == usuario.email }) {
            println("El usuario con email ${usuario.email} ya está registrado.")
            false
        } else {
            usuarios.add(usuario)
            println("Usuario ${usuario.username} agregado correctamente.")
            true
        }
    }

    fun mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            println("No hay usuarios registrados.")
        } else {
            println("Usuarios registrados:")
            usuarios.forEach { println("Username: ${it.username}, Email: ${it.email}") }
        }
    }

    fun buscarUsuarioPorEmail(email: String): Usuario? {
        val usuario = usuarios.find { it.email == email }
        return usuario ?: run {
            println("Usuario con email $email no encontrado.")
            null
        }
    }


}
