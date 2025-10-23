package com.fp.teoria.funciones_avanzadas.ejercicios_refuerzo

fun main() {

    val palabras = listOf("Android", "Compose", "Java", "Flutter", "Kotlin", "Activity")
    var filtradas: List<String> = mutableListOf()

    //Opcion con funcion normal
    filtradas = palabras.filter(::empiezarPorLetraA)
    println(filtradas)

    //Opcion con funcion anonima
    val funcionAnonima = fun(palabra: String): Boolean = palabra.startsWith("A")
    filtradas = palabras.filter(funcionAnonima)
    println(filtradas)

    //Opcion con lambda
    filtradas = palabras.filter { palabra -> palabra.startsWith("A") }
    println(filtradas)

}

fun empiezarPorLetraA(palabra: String): Boolean {
   return palabra.startsWith("A");
}