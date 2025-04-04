package teoria.elementos_basicos

fun main() {

    var a = -3

    println("a=${-a}")

    a = 10
    val b = 20

    println("($a + $b)= ${a + b}")
    println("($a - $b)= ${a - b}")
    println("($a x $b)= ${a * b}")
    println("($a / $b)= ${a / b}")
    println("($a % $b)= ${a % b}")

    a += b
    println("+= $a")
    a -= b
    println("-= $a")
    a *= b
    println("*= $a")
    a /= b
    println("/= $a")
    a %= b
    println("%= $a")


    println("$a es igual a $b: ${a == b}")
    println("$a es diferente a $b: ${a != b}")
    println("$a es menor que $b: ${a < b}")
    println("$a es mayor que $b: ${a > b}")
    println("$a es menor o igual que $b: ${a <= b}")
    println("$a es mayor o igual que $b: ${a >= b}")
}