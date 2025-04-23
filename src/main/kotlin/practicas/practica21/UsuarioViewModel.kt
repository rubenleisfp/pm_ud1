package practicas.practica21

class UsuarioViewModel {
    private var usuarios: List<UsuarioState> = emptyList()

    fun agregarUsuario(id: Int, nombre: String) {
        usuarios = usuarios + UsuarioState(id, nombre)
    }

    fun cambiarEstadoUsuario(id: Int) {
        //Nueva traza
        //Para actualizar el estado de un usuario
        //Crear una nueva lista a partir de la existente.
        //Recorremos la actual lista de usuarios y:
        //A) si coincide el id del usuario con el recibido como argumento, cambiamos el estado del usuario
        //y lo añadimos a la nueva lista.
        //B) Sino coincide simplemente deberemos incluir el usuario en la nueva lista
        //Una vez que hayamos recorrido la lista de usuarios y volcado la información en la nueva lista, solo debemos sustituir
        //nuestra lista de usuarios actual por la nueva.

        val nuevosUsuarios = mutableListOf<UsuarioState>()
        for (usuario in usuarios) {
            if (usuario.id == id ) {
                nuevosUsuarios.add(usuario.copy(activo = !usuario.activo))
            } else {
                nuevosUsuarios.add(usuario)
            }
        }
        usuarios = nuevosUsuarios
    }

    fun obtenerUsuarios(): List<UsuarioState> = usuarios
}