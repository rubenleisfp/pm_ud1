package teoria.colecciones


    fun main() {

       // val listaMutable: MutableList<Int?> = mutableListOf<Int?>()
       // listaMutable.add(0,1);

        val oneToFiveList: List<Int> = listOf(1, 2, 3, 4, 5)
        println(oneToFiveList) // [1, 2, 3, 4, 5]

        println(oneToFiveList.size) // 5
        println(oneToFiveList.get(1)) // 2
        println(oneToFiveList[2]) // 3
        println(oneToFiveList.indexOf(5)) // 4
        println(oneToFiveList.lastIndexOf(6)) // -1
        println(oneToFiveList.subList(0, 2)) // [1, 2]

        val colorsList = mutableListOf("Amarillo", "Azul", "Rojo")

        colorsList.add("Verde") // [Amarillo, Azul, Rojo, Verde]
        colorsList.add(0, "Blanco") // [Blanco, Amarillo, Azul, Rojo, Verde]
        colorsList.removeAt(2) // [Blanco, Amarillo, Rojo, Verde]
        colorsList[1] = "Negro" // [Blanco, Negro, Rojo, Verde]
        colorsList.sortDescending()

        println(colorsList) // [Verde, Rojo, Negro, Blanco]
    }
