package teoria.clases

class Plane {
    var x: Int = 0 
        private set

    var y: Int = 0
        private set


    fun moveLeft() {
        x -= if (x == 0) 0 else 1
    }


    fun moveRight() {
        x += if (x == 300) 0 else 1
    }


    fun moveUp() {
        y -= if (y == 0) 0 else 1
    }


    fun moveDown() {
        y += if (y == 300) 0 else 1
    }

    override fun toString(): String {
        return "Plane(x=$x, y=$y)"
    }


}
