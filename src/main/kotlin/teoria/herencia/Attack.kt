package teoria.herencia

abstract class Attack {
    val baseDamage: Int = 10


    abstract fun execute(): String
}


fun main() {
//    val attacks = mutableListOf(Headbutt(), DoubleKick(), Fireball())
//    attacks.forEach { println(it.execute()) }

    val ataque : Attack = Fireball()
    println(ataque.execute())

}
