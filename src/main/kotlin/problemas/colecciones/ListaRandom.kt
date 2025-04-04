package problemas.colecciones

fun main() {
    //primeraOpcion()
    segundaOpcion()

}

fun segundaOpcion() {
    val list1: MutableList<Int> = mutableListOf()

    //Rellenamos los 20 primeros numeros
    for (i in 1..20) {
         val randonNumber = ((Math.random() * 6) + 1).toInt()
        list1.add(randonNumber);
    }
    println(list1)

    //Contamos los unos
    var contadorUnos = 0
    for (i in list1) {
        if (i==1) {
            contadorUnos++
        }

    }
    println(contadorUnos)

    //Borramos los 6
    list1.removeAll { it ==6 }
    println(list1)
}

private fun primeraOpcion() {
    val lista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }
    println("Lista completa")
    println(lista)
    val cant = lista.count { it == 1 }
    println("Cantidad de elementos con el valor 1: $cant")
    lista.removeAll { it == 6 }
    println("Lista luego de borrar los elementos con el valor 6")
    println(lista)
}