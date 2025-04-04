package problemas.clases.bibilioteca

class Pelicula(
    titulo: String,
    añoPublicacion: Int,
    codigo: String,
    val director: String
) : Material(titulo, añoPublicacion, codigo) {
    override fun toString(): String {
        return "Pelicula(titulo='$titulo', añoPublicacion=$añoPublicacion, codigo='$codigo', director='$director', prestado=$prestado)"
    }
}
