package problemas.clases.bibilioteca

abstract class Material(
    val titulo: String,
    val añoPublicacion: Int,
    val codigo: String
) : Gestionable {
    protected var prestado: Boolean = false

    override fun prestar() {
        if (prestado) {
            throw Exception("El material ya está prestado.")
        }
        prestado = true
        println("El material '$titulo' ha sido prestado.")
    }

    override fun devolver() {
        if (!prestado) {
            throw Exception("El material no estaba prestado.")
        }
        prestado = false
        println("El material '$titulo' ha sido devuelto.")
    }
}
