package ejercicio

fun main() {
    val cuentaAhorro: CuentaAhorro = CuentaAhorro(20000.0f, 0.12f)
    val cuentaCorriente = CuentaCorriente(1000.0f, 0.12f)

    println("=========================")
    println("=== Cuenta de Ahorro ===")
    println("=========================")
    cuentaAhorro.retirarDinero(5000.0f)
    cuentaAhorro.retirarDinero(50.0f)
    cuentaAhorro.retirarDinero(50.0f)
    cuentaAhorro.retirarDinero(50.0f)
    cuentaAhorro.consignarDinero(5000.0f)
    cuentaAhorro.cerrarMes()
    cuentaAhorro.imprimirDatos()


    println("\n=========================")
    println("=== Cuenta Corriente ===")
    println("=========================")
    cuentaCorriente.retirarDinero(1500.0f)
    cuentaCorriente.consignarDinero(700.0f)
    cuentaCorriente.consignarDinero(500.0f)
    cuentaCorriente.cerrarMes()
    cuentaCorriente.imprimirDatos()

}