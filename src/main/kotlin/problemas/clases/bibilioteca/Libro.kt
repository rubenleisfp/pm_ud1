package problemas.clases.bibilioteca

class Libro(
    titulo: String,
    añoPublicacion: Int,
    codigo: String,
    val autor: String
) : Material(titulo, añoPublicacion, codigo) {
    override fun toString(): String {
        return "Libro(titulo='$titulo', añoPublicacion=$añoPublicacion, codigo='$codigo', autor='$autor', prestado=$prestado)"
    }
}
