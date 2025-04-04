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
        throw UnsupportedOperationException("A implementar por el alumno")
    }
}

fun main() {
    val animalFactory = AnimalFactory()

    println("Escribe el tipo de animal a crear Cat(C) o Dog(D):")
    val userInput  = readln()
    
    val animal = animalFactory.createAnimal(userInput.orEmpty())
    animal?.makeSound()
}