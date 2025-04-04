package problemas.clases.bibilioteca

interface Gestionable {
    @Throws(Exception::class)
    fun prestar()

    @Throws(Exception::class)
    fun devolver()
}