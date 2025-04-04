package problemas.funciones

fun main() {
    val number1 = 15
    val number2 = 3

    println("$number1 is divisible by $number2: ${number1 isDivisibleBy number2}")
}

infix fun Int.isDivisibleBy(divisor: Int): Boolean {
    return this % divisor == 0
}
