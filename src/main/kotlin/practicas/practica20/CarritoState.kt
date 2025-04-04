package practicas.practica20

data class CarritoState(
    val productos: List<Producto> = emptyList(),
    val total: Double = 0.0
)
