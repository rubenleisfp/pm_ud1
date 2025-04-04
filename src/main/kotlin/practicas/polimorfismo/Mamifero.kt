package practicas.polimorfismo

// Subclase Mamifero
class Mamifero(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido(): String {
        return "rugido"
    }
}