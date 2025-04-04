package teoria.clases

class Animal(
    val name: String,
    var age: Int
) {
    val isOlderThanTen
        get() = this.age > 0


    var overWeight = false


    var weight = 0.0
        set(value) {
            field = value
            overWeight = value > 100
        }
}

