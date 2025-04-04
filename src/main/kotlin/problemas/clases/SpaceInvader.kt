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
    throw UnsupportedOperationException("A implementar por el alumno")
}

fun getRandomCoordenate(doomRange: Int): Int {
    throw UnsupportedOperationException("A implementar por el alumno")
}


class SpaceInvader(val name: String, val rangeDoom: Int) {

    var health: Int = 100
    var x: Int = 0
    var y: Int = 0

    var enemy: SpaceInvader? = null

    fun attachEnemy(enemy: SpaceInvader) {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun moveLeft() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun moveRight() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun moveUp() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun moveDown() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun attack(x: Int, y: Int) {

        throw UnsupportedOperationException("A implementar por el alumno")
    }


    fun isGameEnded(): Boolean {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    private fun wasEnemyReached(x: Int, y: Int) = enemy?.x == x && enemy?.y == y

    private fun emenyNotReached() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    private fun enemyImpacted() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    fun showPlayers() {
        throw UnsupportedOperationException("A implementar por el alumno")
    }

    override fun toString(): String {
        return "SpaceInvader(name: $name, x: $x,y: $y,health: $health)"
    }

}