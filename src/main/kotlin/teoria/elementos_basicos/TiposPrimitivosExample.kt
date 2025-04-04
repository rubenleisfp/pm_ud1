package pm_ud_1.introduccion

fun main() {

	val health: Short = 150

	//en Java -> Int missionPoints = 40000
	val missionPoints: Int = 40000
	val experience: Long = 45121365412
	val monstersExecuted = 9990001522L // La 'L' especifica al tipo Long

	val variablePorDefectoInt:Int = 40000

	val bitmapLocation = 0b00100001 // Literal binario 0b ó 0B
	val chestColor = 0xCCC // Literal hexadecimal 0x ó 0X

	println(bitmapLocation)
	println(chestColor)

	val dodgeChance: Double = 0.2
	println(dodgeChance)


	val response: Char = 'Y'
	println(response)


	print("Uno\nDos\nTres\tTabulacion")

	val globalMapEnable: Boolean = true
	println(globalMapEnable)

	val level: Short = 75
//	val first: Int = level
	val first: Int = level.toInt()
	println(level)


	val measure:Int = 4005215
	println("toShort():${measure.toShort()}")




}