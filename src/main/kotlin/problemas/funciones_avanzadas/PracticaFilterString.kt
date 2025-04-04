package problemas.funciones_avanzadas
fun filtrar(cadena: String, fn: (Char) -> Boolean): String
{
    val cad = StringBuilder()
    for(ele in cadena)
        if (fn(ele))
            cad.append(ele)
    return cad.toString()
}

fun main() {
    val cadena="¿Esto es la prueba 1 o la prueba 2?"
    println("String original")
    println(cadena)
    val resultado1 = filtrar(cadena) {
        if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U' )
            true
        else
            false
    }
    println("Solo las vocales")
    println(resultado1)
    var resultado2 = filtrar(cadena) {
        if (it in 'a'..'z')
            true
        else
            false
    }
    println("Solo los caracteres en minúsculas")
    println(resultado2)
    var resultado3 = filtrar(cadena) {
        if (it !in 'a'..'z' && it !in 'A'..'Z')
            true
        else
            false
    }
    println("Solo los caracteres no alfabéticos")
    println(resultado3)
}