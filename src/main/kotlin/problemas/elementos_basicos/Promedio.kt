fun main(parametros: Array<String>) {
    print("Ingrese primer nota:")
    val nota1 = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3 = readln().toInt()

    val sumaNotas: Int = (nota1 + nota2 + nota3)
    val promedio: Int = sumaNotas / 3
    //Redondeamos hacia arriba
    //val promedio: Int = Math.ceil(sumaNotas.toDouble() / 3).toInt()

/*    println("promedio: $promedio")
    if (promedio >= 7) {
        print("Promocionado")
    }
    else
        if (promedio >= 4)
            print("Regular")
        else
            print("Suspenso")*/

    when (promedio.toDouble()){
        in 7.1..10.0 -> print("Promociona")
        in 4.1 .. 7.1-> print("Regular")
        in 0.0 .. 4.0-> print("supenso")
        else -> {
            print("numeros no validos")
        }
    }

}