fun main() {

    //val arreglo = arrayOf(4) // solo tiene una posición y su valor 4
    val arreglo = IntArray(4) // tiene 4 posiciones el array y no lo hemos rellenado

    //1.- Relleno los valores del array
    for(i in 0..3) {            // Otra opcion=> for (i in arreglo.indices)
        //for(i in 0..arreglo.size-1) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    //Otra opcion
    //

    //2.- Compruebo si esta ordenado
    var ordenado = true
    for(i in 0..arreglo.size-2)
        if (arreglo[i] >= arreglo[i+1])
            ordenado = false

    //3.- Pinto por consola el resultado
    if (ordenado)
        print("Los elementos están ordenados de menor a mayor")
    else
        print("Los elementos no están ordenados de menor a mayor")
}