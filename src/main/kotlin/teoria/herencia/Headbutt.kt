package teoria.herencia

class Headbutt : Attack() {
    override fun execute(): String {
        return "¡Cabezazo! ${baseDamage + 1}"
    }
}


class DoubleKick : Attack() {
    override fun execute(): String {
        return "¡Golpe doble! ${baseDamage + 2}"
    }
}


class Fireball : Attack() {
    override fun execute(): String {
        return "¡Bola de fuego! ${baseDamage + 30}"
    }
}
