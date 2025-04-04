package teoria.elementos_basicos

fun main() {
    var result: Int = 0
    result = model(3, 4, 5)
    println(result)

    /*
    print(square(2))
    println("f(1,0,5)= ${model(1, 0, 5)}")
    isVowel('v')
    loadCustomer()
    */

    var funct = model(3,5,6)
    println("funct:" + funct)

    topLevelPrint()
}

fun model(x: Int, y: Int, z: Int):Int = 3 * x - 2 * y + z * z

fun modelvieja(x:Int, y:Int,z:Int): Int {
    return 3 * x - 2 * y + z * z
}


fun square(x: Int): Int {
    return x * x
}

//fun model(x: Int, y: Int, z: Int) = 3 * x - 2 * y + z * z

/*
fun model(x: Int, y: Int, z: Int):Int {
  return 3 * x - 2 * y + z * z
}
*/


fun isVowel(c: Char): Unit {
    when (c) {
        'a', 'e', 'i', 'o', 'u' -> println("$c es una vocal")
        else -> println("$c no es una vocal")
    }
}

val customers = arrayOf("Carlos", "Miguel", "Ximena")

fun loadCustomer(limit: Int = 0): String {
    return customers[limit]
}

