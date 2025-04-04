package problemas.elementos_basicos

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("¿Qué hora es? (0-24): ")
    val hora = scanner.nextInt()

    println("¿Deseas el modo Koruño? (si/no): ")
    val modoKoruño = scanner.next().lowercase()

    if (modoKoruño == "si") {
        saludoKoruño(hora)
    } else {
        saludoEducado(hora)
    }
}

fun saludoEducado(hora: Int) {
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun saludoKoruño(hora: Int) {
    throw UnsupportedOperationException("A implementar por el alumno")
}
