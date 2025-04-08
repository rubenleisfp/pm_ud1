package com.fp.teoria.dataclass

fun main() {
    //ALUMNOS
    var natalia = Alumno("Natalia",28)
    var fer = Alumno("Fer", 28)
    var alain = Alumno("Alain", 21)
    var ponce = Alumno("Ponce", 21)
    var ruben = Alumno("Ruben", 41)

    //Dataclass. Tenemos el setter, getter, toString, copy, equals "gratis"
    natalia.edad = 26
    println(natalia)

    //COPY
    var hermitas = Alumno("Hermitas", edad=74)
    var divina = hermitas.copy("Divina")
    println(divina)
    alain = alain.copy(edad = 63, nombre = "Alberto")
    println(alain)

    //Agregamos los alumnos a una lista
    var listaAlumnos : MutableList<Alumno> = mutableListOf()
    listaAlumnos.add(natalia)
    listaAlumnos.add(fer)
    listaAlumnos.add(alain)
    listaAlumnos.add(ponce)
    listaAlumnos.add(ruben)

    //Creamos la clase DAM2 con los alumnos
    var clase = Clase("DAM2", listaAlumnos)
    println(clase)

    //Añadimos a Hermitas en la lista de alumnos y cambiamos DAM2 a DAM3
    clase = clase.copy(nombre = "DAM3",listaAlumnos = clase.listaAlumnos  + hermitas)
    println(clase)
}