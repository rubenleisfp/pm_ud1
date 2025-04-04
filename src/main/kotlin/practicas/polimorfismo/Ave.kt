package practicas.polimorfismo

class Ave(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido(): String {
        return "canto"
    }
}