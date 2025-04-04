package teoria.clases

class Weapon(attack: Int, speed: Double) {
    val attack: Int
    val speed: Double


    init {
        this.attack = attack + 100
        this.speed = speed /2
    }
}
