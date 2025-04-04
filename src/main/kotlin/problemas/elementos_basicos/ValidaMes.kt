package problemas.elementos_basicos



/**
 * Devuelve el número de días correspondiente al mes que se pasa como parámetro.
 * Si el mes es inválido, devuelve -1.
 *
 * @param mes El mes para el que se quiere obtener el número de días.
 * @return El número de días del mes.
 */
fun obtenerDiasValidos(mes: String): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}

/**
 * Verifica si un día es válido para un mes dado.
 *
 * @param dia El día que se desea verificar.
 * @param mes El mes en el que se desea verificar el día.
 * @return `true` si el día es válido para el mes, `false` en caso contrario.
 */
fun esDiaValido(dia: Int, mes: String): Boolean {
    throw UnsupportedOperationException("A implementar por el alumno")
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
