package problemas.elementos_basicos



fun obtenerDiasValidos(mes: String): Int {
    return when (mes.toLowerCase()) {
        "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre" -> 31
        "abril", "junio", "septiembre", "noviembre" -> 30
        "febrero" -> 28  // Aquí asumimos que no se está considerando si es un año bisiesto
        else -> -1  // Caso por si el mes es inválido
    }
}

fun esDiaValido(dia: Int, mes: String): Boolean {
    val diasValidos = obtenerDiasValidos(mes)
    return dia in 1..diasValidos
}

fun main() {
    print("Introduzca día: ")
    val dia = readLine()?.toIntOrNull() ?: 0

    print("Mes: ")
    val mes = readLine()?.capitalize() ?: ""

    val diasValidos = obtenerDiasValidos(mes)

    if (diasValidos == -1) {
        println("Mes inválido.")
    } else if (esDiaValido(dia, mes)) {
        println("Día correcto.")
    } else {
        println("Día incorrecto. $mes solo tiene los días [1-$diasValidos]")
    }
}
