package practicas.practica2

abstract class Animal {
    abstract fun makeSound()
}

class Tigre : Animal() {
    override fun makeSound() {
        println("Tigre: Roar!")
    }
}

class Leon : Animal() {
    override fun makeSound() {
        println("Leon: Roar!")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Guau!")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Miau!")
    }
}

class AnimalFactory {
    fun createAnimal(type: String): Animal? {
        return when (type) {
            "T" -> Tigre()
            "L" -> Leon()
            "C" -> Cat()
            "D" -> Dog()
            else -> null
        }
    }
}

fun main() {
    val animalFactory = AnimalFactory()
    //val userInput = "Lion"

    println("Escribe el tipo de animal a crear Cat(C) o Dog(D):")
    val userInput  = readln()
    //println("Type of animal (Tiger or Lion): $userInput")
    
    val animal = animalFactory.createAnimal(userInput.orEmpty())
    animal?.makeSound()
}