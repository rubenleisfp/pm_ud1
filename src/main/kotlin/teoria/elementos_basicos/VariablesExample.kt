package pm_ud_1.introduccion

fun main() {
	val xPos: Int = 1 // Asignación junto a declaración
	val yPos: Int   // Declaración
	yPos = 5    // Asignación
	println("hola mundo")

	val enemyHealth: Int
	//ERROR: necesario inicializaar
	//println(enemyHealth)

	var xPos1: Int = 1
	val yPos1: Int = 5

	xPos1 = 2

	println("Coordenada actual del jugador: ($xPos1, $yPos1)")

	val playerName = "Oliver" // Se infiere :String
	val playerHealth = 75 // Se infiere :Int
	val playerLucky = 0.2 // Se infiere :Double

	var playerSpeed = 12
//	ERROR: inferencia realizada
//	playerSpeed = "Lento" 
}