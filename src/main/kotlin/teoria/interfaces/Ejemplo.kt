package teoria.interfaces

class Ejemplo : Interfaz {
    override val p1: Int = 3
    override fun m1() {
        println("Metodo implementado por clase Ejemplo")
    }


}

fun main() {
    var ejemplo = Ejemplo()
    println(ejemplo.p1)
    println(ejemplo.p2)
    ejemplo.m1()
    ejemplo.m2()
}
