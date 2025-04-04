package problemas.colecciones.gestor_usuario

fun main() {
        val gestorUsuarios = GestorUsuarios()

        // Agregar usuarios
        gestorUsuarios.agregarUsuario(Usuario("john_doe", "john@example.com"))
        gestorUsuarios.agregarUsuario(Usuario("jane_doe", "jane@example.com"))
        gestorUsuarios.agregarUsuario(Usuario("john_doe", "john@example.com")) // Usuario duplicado

        // Mostrar usuarios
        gestorUsuarios.mostrarUsuarios()

        // Buscar usuario por email
        val usuario = gestorUsuarios.buscarUsuarioPorEmail("jane@example.com")
        usuario?.let {
            println("Usuario encontrado: Username: ${it.username}, Email: ${it.email}")
        }

        // Intentar buscar un usuario que no existe
        gestorUsuarios.buscarUsuarioPorEmail("not_found@example.com")
    }