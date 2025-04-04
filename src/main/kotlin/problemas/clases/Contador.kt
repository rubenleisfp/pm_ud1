package problemas.clases


class ProbarCompanion {
    companion object {
        var contador: Int = 0
        fun imprimirValor() = println("Valor de contador:  $contador")
    }

    fun aumentarContador() {
        contador++
    }

}


fun main() {
    ProbarCompanion.contador++
    ProbarCompanion.contador++
    ProbarCompanion.contador++
    ProbarCompanion.contador++

    ProbarCompanion.imprimirValor()

    val instanciaClase = ProbarCompanion()
    instanciaClase.aumentarContador()

    ProbarCompanion.imprimirValor()
}