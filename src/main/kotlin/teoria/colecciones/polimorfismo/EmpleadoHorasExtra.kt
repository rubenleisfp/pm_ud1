package teoria.colecciones.polimorfismo

class EmpleadoHorasExtra(val base: Double, val numHoras: Int) : Empleado {

    override fun calcularSalario(): Double {
        return base + salarioHoraExtra() * numHoras
    }

    private fun salarioHoraExtra() = base / 160 * 2

    override fun printSalario() {
        println("Salario empleado con horas extra: ${calcularSalario()}")

    }
}
