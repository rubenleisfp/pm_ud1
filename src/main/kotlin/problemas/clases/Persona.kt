package problemas.clases

import java.util.*

/*

1.2.2.12 b Declarar una clase llamada persona con dos propiedades que almacenen el nombre y la edad de la persona.
 En la propiedad nombre almacenar siempre en mayúscula el nombre y cuando se recupere su valor retornarlo entre
 paréntesis, también controlar que no se pueda ingresar una edad con valor negativo, en dicho caso almacenar un cero.
 Todos estas funcionalidades las implementarás en el setter y getter de la clase.

 */

class Persona {
    var nombre = ""
        get() = "($field)"
        set(value) {
            field = value.uppercase()
        }


    var edad=0
        get() = field
}

fun main() {
    var p1 = Persona()
    p1.nombre="ruben"
    println(p1.nombre)

//    var persona = Persona()
//    persona.nombre = "ruben"
//    persona.edad=-50
//
//    println(persona.nombre)
//    println(persona.edad)
//
//    persona.edad=41
//    println(persona.edad)
}