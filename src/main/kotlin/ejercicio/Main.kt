package ejercicio

fun main() {
    val cuentaAhorro: CuentaAhorro = CuentaAhorro(20000.0f, 0.12f)
    cuentaAhorro.retirarDinero(5000.0f)
    cuentaAhorro.retirarDinero(50.0f)
    cuentaAhorro.retirarDinero(50.0f)
    cuentaAhorro.retirarDinero(50.0f)
    cuentaAhorro.consignarDinero(5000.0f)
    cuentaAhorro.cerrarMes()
    cuentaAhorro.imprimirDatos()
}