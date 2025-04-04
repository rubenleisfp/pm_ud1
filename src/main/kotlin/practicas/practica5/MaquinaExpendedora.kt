package practicas.practica5

/*
 * TODO falta por completar el codigo
 *
 * MÁQUINA EXPENDEDORA
 *
 * Enunciado: Simula el funcionamiento de una máquina expendedora creando una operación
 * que reciba dinero (array de monedas) y un número que indique la selección del producto.
 * - El programa retornará el nombre del producto y un array con el dinero de vuelta (con el menor
 *   número de monedas).
 * - Si el dinero es insuficiente o el número de producto no existe, deberá indicarse con un mensaje
 *   y retornar todas las monedas.
 * - Si no hay dinero de vuelta, el array se retornará vacío.
 * - Para que resulte más simple, trabajaremos en céntimos con monedas de 5, 10, 50, 100 y 200.
 * - Debemos controlar que las monedas enviadas estén dentro de las soportadas.
 *
 */

fun main() {
    val pair1 = buy(1, arrayOf(Money.FIVE, Money.FIVE, Money.TEN, Money.TEN, Money.TEN, Money.FIVE))
    println(pair1.first + " " + pair1.second.contentToString())

    val pair2 = buy(3, arrayOf(Money.FIVE, Money.FIVE, Money.TEN, Money.TEN, Money.TEN, Money.FIVE))
    println(pair2.first + " " + pair2.second.contentToString())

    val pair3 = buy(1, arrayOf(Money.FIVE, Money.FIVE, Money.TEN, Money.TEN, Money.TEN, Money.FIVE, Money.FIFTY))
    println(pair3.first + " " + pair3.second.contentToString())

    val pair4 = (buy(5, arrayOf(Money.TWOHUNDRED)))
    println(pair4.first + " " + pair4.second.contentToString())
}

private enum class Money(val money: Int) {

    FIVE(5),
    TEN(10),
    FIFTY(50),
    ONEHUNDRED(100),
    TWOHUNDRED(200)

}

/**
 * Funcion que se encarga de validar la compra de un producto y devolver las monedas adecuadas al
 * usuario
 *
 * Devuelve un Pair
 *      String: mensaje a mostrar al usuario
 *      Array<Money>: monedas devueltas al usuario
 */
private fun buy(code: Int, money: Array<Money>): Pair<String, Array<Money>> {

    val products = mapOf<Int, Pair<String, Int>>(
        1 to Pair("Agua", 50),
        2 to Pair("Coca-Cola", 100),
        4 to Pair("Cerveza", 155),
        5 to Pair("Pizza", 200),
        10 to Pair("Donut", 75)
    )


    //TODO Aqui deberia comprobarse que:
    //1. El producto exista, sino devolver el mensaje correspondiente de error
    //2. El importe introducido llegue para pagar el producto, sino devolver el mensaje correspondiente de error
    //3. Si el importe introducido es correcto y el producto existe, debera llamar a returnMoney para saber que monedas devolver

    return Pair("", arrayOf())
}

/**
 * Funcion encargada de saber que monedas se deben devolver al usuario a partir de un importe a devolver
 *
 * pendingMoney: dinero pendiente de devolver al usuario
 * money: monedas que se devolveran al usuario
 *
 */
private fun returnMoney(pendingMoney: Int, money: Array<Money> = arrayOf()): Array<Money> {

    if (pendingMoney == 0) {
        return money
    }
    //Total de cambio pendiente de devolver
    var newPendingMoney = pendingMoney
    //Array de monedas a devolver
    val newMoney = money.toMutableList()

    //TODO aqui es necesario ir añadiendo las monedas que debemos devolver mientras
    // aun quede importe por devolver, podemos usar recursividad
    //....
    return returnMoney(newPendingMoney, newMoney.toTypedArray())
}