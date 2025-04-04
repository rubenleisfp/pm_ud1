package pm_ud_1.introduccion

fun main() {
	val customerName:String = "Claudia Martinez"
	//val customerName = "Claudia Martinez" // Puedes omitir el tipo

	println(customerName[5])
	println(customerName.get(5))

	for(char in customerName){
		print(char)
	}

	for (index in customerName.indices) {
		println(customerName[index])
	}

	println(customerName.length) // 16

	val a = "José" + " Monteria"
	val b = "Cantidad de ahorros: " + 536.4
	val c = "Resultado: " + (2 + 4)

	var d = "Nueva concatenación"
	d += '!'// "Nueva concatenación!"

	val welcomeText = """
        ¡Bienvenido a la guía de Kotlin de develou.com!
        En esta serie de tutoriales aprenderás 
        los conceptos básicos sobre el lenguaje
        y las herramientas necesarias para probarlo
    """
	println(welcomeText)

	val welcomeText2 = """
        |¡Bienvenido a la guía de Kotlin de develou.com!
        |En esta serie de tutoriales aprenderás 
        |los conceptos básicos sobre el lenguaje
        |y las herramientas necesarias para probarlo
    """.trimMargin()
	println(welcomeText2)

	val playerName = "NKiller"
	println("Tu nuevo nombre es $playerName")

	println("Tamaño del nick:${playerName.length}")
}