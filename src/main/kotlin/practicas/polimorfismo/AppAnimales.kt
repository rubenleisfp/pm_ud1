package practicas.polimorfismo

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val zoologico = mutableListOf<Animal>()

    // Inicializamos el zoológico con algunos animales
    //zoologico.add(Mamifero("León", 5))
    //zoologico.add(Ave("Loro", 2))

    mostrarMenu(zoologico, scanner)

}

// Función para listar sonidos de los animales usando polimorfismo
fun listarSonidos(animales: List<Animal>) {
    for (animal in animales) {
        println("${animal.nombre} hace: ${animal.hacerSonido()}")
    }
}

// Función para calcular el promedio de edad usando una lambda
fun calcularPromedioEdad(animales: List<Animal>): Double {
    return if (animales.isNotEmpty()) animales.map { it.edad }.average() else 0.0
}

// Función para agregar animales mediante teclado
fun agregarAnimal(zoologico: MutableList<Animal>, scanner: Scanner) {
    println("Selecciona el tipo de animal a agregar:")
    println("1. Mamífero")
    println("2. Ave")
    when (scanner.nextInt()) {
        1 -> {
            println("Introduce el nombre del mamífero:")
            val nombre = scanner.next()
            println("Introduce la edad del mamífero:")
            val edad = scanner.nextInt()
            zoologico.add(Mamifero(nombre, edad))
            println("$nombre agregado al zoológico.")
        }
        2 -> {
            println("Introduce el nombre del ave:")
            val nombre = scanner.next()
            println("Introduce la edad del ave:")
            val edad = scanner.nextInt()
            zoologico.add(Ave(nombre, edad))
            println("$nombre agregado al zoológico.")
        }
        else -> println("Opción no válida.")
    }
}

// Función para mostrar el menú y manejar las opciones
fun mostrarMenu(zoologico: MutableList<Animal>, scanner: Scanner) {
    var salir = false
    while (!salir) {
        println("\n--- Menú del Zoológico ---")
        println("1. Agregar animal")
        println("2. Listar sonidos de los animales")
        println("3. Filtrar animales con mas de 3 años")
        println("4. Calcular promedio de edad")
        println("5. Salir")
        println("Seleccione una opción:")
        when (scanner.nextInt()) {
            1 -> agregarAnimal(zoologico, scanner)
            2 -> listarSonidos(zoologico)

            3 -> {
                val animales = zoologico.filter { animal: Animal ->  animal.edad > 3}
                println(animales)
            }

            4 -> {
                val promedioEdad = calcularPromedioEdad(zoologico)
                println("El promedio de edad de los animales es: $promedioEdad")
            }

            5 -> {
                println("Saliendo del menú...")
                salir = true
            }

            else -> println("Opción no válida.")
        }
    }
}
