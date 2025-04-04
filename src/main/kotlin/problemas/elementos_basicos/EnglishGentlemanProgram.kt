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
    when (hora) {
        in 0..11 -> println("Good Morning!!")
        in 12..16 -> println("Good Afternoon!!")
        in 17..20 -> println("Good Evening!!")
        in 21..24 -> println("Good Night!!")
        else -> println("Not a valid hour value")
    }
}

fun saludoKoruño(hora: Int) {
    when (hora) {
        in 6..14 -> println("Bo día!!")
        in 15..20 -> println("Boa tarde!!")
        in 21..24, in 0..5 -> println("Boa noite. Benvidos a Luar!!")
        else -> println("Atina coa hora meu")
    }
}
