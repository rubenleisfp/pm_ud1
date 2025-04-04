package problemas.elementos_basicos

fun esBisiesto(ano: Int): Boolean {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
}

fun main() {
    val ano = 2024
    if (esBisiesto(ano)) {
        println("El año $ano es bisiesto.")
    } else {
        println("El año $ano no es bisiesto.")
    }
}
