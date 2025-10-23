package com.fp.teoria.funciones_avanzadas.ejercicios_refuerzo

fun mostrarMensaje(nombre: String, accion: (String) -> Unit) {
    println("Inicio del mensaje:")
    accion(nombre) // Ejecutamos la lambda
    println("Fin del mensaje.")
}

fun main() {
    mostrarMensaje("Pepe") { nombre ->
        println("Hola $nombre desde dentro de la lambda 👋")
    }
}
