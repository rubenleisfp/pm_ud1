package teoria.colecciones.polimorfismo

fun main() {

    val empleados: MutableList<Empleado> = mutableListOf<Empleado>()
    empleados.add(EmpleadoSinHorasExtra(1500.0))
    empleados.add(EmpleadoHorasExtra(2000.0, 10))

    for (empleado in empleados) {
        empleado.printSalario()
    }
}





