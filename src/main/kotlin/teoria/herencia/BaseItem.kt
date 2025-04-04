package teoria.herencia

open class BaseItem(val name: String) {
    open var quantity = 1
}


class PopularItem(name: String) : BaseItem(name) {
     //override var quantity = 6
}


fun main() {
    // Añadir item regular de orden
    val notebook = BaseItem("Cuaderno")

    // Añadir item popular
    val pencil = PopularItem("Lapicero")

    // Mostrar factura
    println("${notebook.name} x ${notebook.quantity}")
    println("${pencil.name} x ${pencil.quantity}")
}
