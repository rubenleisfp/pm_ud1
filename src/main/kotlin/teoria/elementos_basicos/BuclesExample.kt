package teoria.elementos_basicos

fun main() {
    for(i in 1..5){
        println("Contando $i")
    }

    for (i in 1..5) println("Contando $i")

    // iteración regular
    for (char in 'a'..'f') print(char)


    // iteración con avance de 2
    println()
    for (char in 'a'..'f' step 2) print(char)


    println()
    // iteración en reversa
    for (char in 'f' downTo 'a') print(char)


    // iteración excluyendo el límite superior
    println()
    for (char in 'a' until 'f') print(char)

    val champions = arrayOf("Teemo", "Ahri", "Vayne", "Brand", "Kindred")


    for (i in champions.indices) {
        println("[$i, ${champions[i]}]")
    }




    // Desestructuración de elementos de Array
    for ((i, v) in champions.withIndex()) {
        println("[$i, $v]")
    }

    for(c in "Ruben"){
        println(c)
    }

    do {
        println("¿Cuál es la capital de Colombia?:")
        println("a. La Paz")
        println("b. Buenos Aires")
        println("c. La Habana")
        println("d. Bogotá")


        print("Respuesta:")
        val option = readLine()!!
        val again = option != "d"


        if(again){
            println("¡Incorrecto!\n")
        }else{
            println("¡Felicitaciones!\n")
        }
    } while (again)


    while (true) {
        print("Escribe una palabra:")
        val word = readLine()!!


        if (word == "salir") break


        println("Caracteres:${word.length}")
    }

    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 1, 0),
    )


    for (row in matrix.indices) {
        for (col in matrix[row].indices) {
            if (matrix[row][col] == 0) {
                println("Matriz inválida en [$col,$row]")
                break
            }
        }
    }
    for (i in 1..20) {
        if (i % 4 != 0) {
            continue
        }
        println(i)
    }
}
