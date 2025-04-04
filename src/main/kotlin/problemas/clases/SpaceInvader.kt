package problemas.clases

import kotlin.random.Random


fun main() {

    println("Doom range?")
    val doomRange = readln().toInt()
    println("Player1 name?")
    val player1Name = readln()
    println("Player2 name?")
    val player2Name = readln()

    var sp1 = SpaceInvader(player1Name, doomRange)
    var sp2 = SpaceInvader(player2Name, doomRange)
    sp1.attachEnemy(sp2)
    sp2.attachEnemy(sp1)

    var isPlayer1Turn: Boolean = true
    var currentSp: SpaceInvader
    while (!sp1.isGameEnded()) {


        if (isPlayer1Turn) {
            isPlayer1Turn = false
            currentSp = sp1
        } else {
            isPlayer1Turn = true
            currentSp = sp2
        }
        println("###################################")
        println("CurrentPlayer:  ${currentSp.name}")
        println("Move direction?")
        val moveDirection = readln()
        val x = getRandomCoordenate(doomRange)
        val y = getRandomCoordenate(doomRange)
        //val x = 0
        //val y = 0

        println("Attacked in coordenates: $x $y")
        currentSp.attack(x, y)
        moveSpaceInvader(currentSp, moveDirection)

        currentSp.showPlayers()
    }

    println("Game Over!!!")
    if (sp1.health < 0) {
        println(" ${sp2.name} wins")
    } else {
        println(" ${sp1.name} wins")
    }
}

fun moveSpaceInvader(currentPlayer: SpaceInvader, movementDirection: String) {
    when (movementDirection) {
        "R" -> currentPlayer.moveRight()
        "L" -> currentPlayer.moveLeft()
        "U" -> currentPlayer.moveUp()
        "D" -> currentPlayer.moveDown()
        else -> println("Invalid movement. We stay in the same position")
    }
}

fun getRandomCoordenate(doomRange: Int): Int {
    return Random.nextInt(0, doomRange)
}


class SpaceInvader(val name: String, val rangeDoom: Int) {

    var health: Int = 100
    var x: Int = 0
    var y: Int = 0

    var enemy: SpaceInvader? = null

    fun attachEnemy(enemy: SpaceInvader) {
        this.enemy = enemy
    }

    fun moveLeft() {
        if (x > 0) {
            x -= 1
        }
        else {
            println("No se pudo mover a la izquierda. Fuera de limite")
        }
    }

    fun moveRight() {
        if (x < rangeDoom -1) {
            x += 1
        } else {
            println("No se pudo mover a la derecha. Fuera de limite")
        }
    }

    fun moveUp() {
        if (y < rangeDoom-1) {
            y += 1
        }
        else {
            println("No se pudo mover arriba. Fuera de limite")
        }
    }

    fun moveDown() {
        if (y > 0) {y -= 1}
        else {
            println("No se pudo mover abajo. Fuera de limite")
        }
    }

    fun attack(x: Int, y: Int) {

        if (enemy == null) {
            throw IllegalStateException("Es necesrio iniciar el juego antes de atacar")
        }

        if (wasEnemyReached(x, y)) {
            enemyImpacted()
        } else {
            emenyNotReached()
        }
        if (isGameEnded()) {

        }
    }


    fun isGameEnded(): Boolean {
        return (this.health <= 0) || (this.enemy?.health!! <= 0)
    }

    private fun wasEnemyReached(x: Int, y: Int) = enemy?.x == x && enemy?.y == y

    private fun emenyNotReached() {
        println("Enemy not impacted!")
        this.health = this.health.minus(10)
    }

    private fun enemyImpacted() {
        println("Enemy impacted!")
        enemy!!.health = enemy!!.health.minus(50)
    }

    fun showPlayers() {
        println(toString())
        println(enemy.toString())
    }

    override fun toString(): String {
        return "SpaceInvader(name: $name, x: $x,y: $y,health: $health)"
    }

}