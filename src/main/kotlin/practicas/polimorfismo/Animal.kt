package practicas.polimorfismo

import java.util.Scanner

// Clase abstracta Animal
abstract class Animal(val nombre: String, val edad: Int) {
    abstract fun hacerSonido(): String
    override fun toString(): String {
        return "Animal(nombre='$nombre', edad=$edad)"
    }


}







