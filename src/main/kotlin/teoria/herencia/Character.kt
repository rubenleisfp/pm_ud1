package teoria.herencia

open class Character(val name: String) {
    open fun die() = println("Morir")
}


class Mage(name: String) : Character(name) {
    override fun die() = println("Mago muriendo")
}


fun main() {
    val jaina = Character("Jaina")
    // Sucesos desafortunados...
    jaina.die()
}
