package com.fp.problemas.live

fun main() {
    probarLambdasColecciones()
}

fun probarLambdasColecciones() {
    val alumnos = mutableListOf<Alumno>()
    var alumnosFiltrados = listOf<Alumno>()
    var alumnosSorted = listOf<Alumno>()

    alumnos.add(Alumno("Pepe", 21))
    alumnos.add(Alumno("Ana", 19))
    alumnos.add(Alumno("Sonia", 20))

    alumnosFiltrados = alumnos.filter { alumno -> alumno.edad > 20}
    println("AlumnosFiltrados: $alumnosFiltrados")

    alumnosSorted = alumnos.sortedBy { alumno -> alumno.edad }
    println("AlumnosSorted: $alumnosSorted")

    val alumno = alumnos.find { alumno -> alumno.nombre == "Ana" }
    println("AlumnoEncontrado: $alumno")
}
