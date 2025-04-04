package teoria.elementos_basicos

fun main() {
    val level = 12

    if (level >= 45) {
        println("Aprendiste Acrobacia")
    } else {
        println("Se requiere nivel 45. Nivel actual $level")
    }

    val enemyHeroHealth = 16
    var cardAttack = if (enemyHeroHealth <= 15) 9 else 6

    cardAttack = if (enemyHeroHealth <= 15) {
        println("Grrrrrrrr!!")
        9
    } else {
        println("...")
        6
    }

    val input = 'y'

    when (input) {
        'y' -> print("Continuando...")
        'n' -> print("Cerrando...")
        else -> print("Entrada inválida")
    }
}