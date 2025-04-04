package teoria.colecciones.polimorfismo

class EmpleadoSinHorasExtra(val base: Double) : Empleado {

    override fun calcularSalario(): Double {
        return base
    }

    override fun printSalario() {
        println("Salario empleado sin horas extra: ${calcularSalario()}")
    }


}