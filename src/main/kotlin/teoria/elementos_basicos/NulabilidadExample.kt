package teoria.elementos_basicos

fun main() {
    //Por defecto, not null
    var notNull:String=""
    //notNull = null

    var a = "Kotlin"
    var b: String? = null

    //Operador de acceso seguro
    println(b?.length) //Si b no es nulo, devuelveme la longitud sino null

    //Operador elvis
    var c= a?.length?:1000 // if (a!=null) a.length else 1000
    println("Valor de c: $c") //6

    c= b?.length?:1000
    println("Valor de c: $c")//1000

    //Convertir en no nullable. Forzamos el acceder a un atributo/metodo
    val counter: Int? = null
    counter!!.dec()
    //counter!!.dec()
    // NPE
    print(counter)

}

fun showBeastsList(beasts: List<String>?) {
    if (beasts!!.isNullOrEmpty()) {
        beasts!!.forEach { println(it) }
    }
}