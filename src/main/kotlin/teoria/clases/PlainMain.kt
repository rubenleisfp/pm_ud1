package com.fp.teoria.clases

import teoria.clases.Plane


fun main() {
        var p1 : Plane = Plane()
        //p1.nombre = "Falcon"
        var p2 : Plane = Plane()
        //p2.nombre = "RyanAir"

        println(p1)
        p1.moveUp()
        p1.moveRight()

        println(p2)
        p2.moveUp()
        p2.moveRight()

        println(p1)
        println(p2)
}