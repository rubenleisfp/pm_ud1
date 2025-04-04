package problemas.clases.bibilioteca

import java.util.Scanner

fun main() {
//    val materiales = mutableListOf<Material>()
//    val scanner = Scanner(System.`in`)
//
//    while (true) {
//        println("Menú:")
//        println("1. Dar de alta un libro")
//        println("2. Dar de alta una película")
//        println("3. Dar de baja un material")
//        println("4. Solicitar el préstamo de un material")
//        println("5. Devolver un material")
//        println("6. Salir")
//        print("Seleccione una opción: ")
//
//        when (scanner.nextInt()) {
//            1 -> {
//                print("Ingrese el título del libro: ")
//                val titulo = scanner.next()
//                print("Ingrese el año de publicación: ")
//                val añoPublicacion = scanner.nextInt()
//                print("Ingrese el código del libro: ")
//                val codigo = scanner.next()
//                print("Ingrese el autor del libro: ")
//                val autor = scanner.next()
//
//                val libro = Libro(titulo, añoPublicacion, codigo, autor)
//                materiales.add(libro)
//                println("Libro agregado correctamente.")
//            }
//            2 -> {
//                print("Ingrese el título de la película: ")
//                val titulo = scanner.next()
//                print("Ingrese el año de publicación: ")
//                val añoPublicacion = scanner.nextInt()
//                print("Ingrese el código de la película: ")
//                val codigo = scanner.next()
//                print("Ingrese el director de la película: ")
//                val director = scanner.next()
//
//                val pelicula = Pelicula(titulo, añoPublicacion, codigo, director)
//                materiales.add(pelicula)
//                println("Película agregada correctamente.")
//            }
//            3 -> {
//                print("Ingrese el código del material a dar de baja: ")
//                val codigo = scanner.next()
//                val material = materiales.find { it.codigo == codigo }
//                if (material != null) {
//                    materiales.remove(material)
//                    println("Material eliminado correctamente.")
//                } else {
//                    println("Material no encontrado.")
//                }
//            }
//            4 -> {
//                print("Ingrese el código del material a prestar: ")
//                val codigo = scanner.next()
//                val material = materiales.find { it.codigo == codigo }
//                if (material != null) {
//                    try {
//                        material.prestar()
//                    } catch (e: Exception) {
//                        println(e.message)
//                    }
//                } else {
//                    println("Material no encontrado.")
//                }
//            }
//            5 -> {
//                print("Ingrese el código del material a devolver: ")
//                val codigo = scanner.next()
//                val material = materiales.find { it.codigo == codigo }
//                if (material != null) {
//                    try {
//                        material.devolver()
//                    } catch (e: Exception) {
//                        println(e.message)
//                    }
//                } else {
//                    println("Material no encontrado.")
//                }
//            }
//            6 -> {
//                println("Saliendo del sistema...")
//                break
//            }
//            else -> println("Opción no válida, intente nuevamente.")
//        }
//    }
}
