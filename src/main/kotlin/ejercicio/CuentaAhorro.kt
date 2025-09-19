package ejercicio

class CuentaAhorro(
    saldo: Float,
    tasaAnual: Float,
    var cuentaActiva: Boolean = false
): CuentaBancaria(saldo, tasaAnual) {

    init {
        if (this.saldo < 10000.0f) {
            this.cuentaActiva = false
            println("La cuenta tiene menos de 10000 soles. Estado de actividad: ${this.cuentaActiva}")
        } else {
            this.cuentaActiva = true
        }
    }

    override fun retirarDinero(monto: Float) {
        if (!this.cuentaActiva) {
            return
        } else {
            super.retirarDinero(monto)
            isActivated()
        }
    }

    override fun consignarDinero(monto: Float) {
        if (!this.cuentaActiva) {
            return
        } else {
           super.consignarDinero(monto)
        }
    }

    override fun extractoMensual(comisionMensual: Float) {
        if (!cuentaActiva) {
            return
        }
        if (numRetiros + numConsignaciones > 4) {
            super.extractoMensual(1000.0f)
            /*
            Lo ideal sería implementar una lógica para considerar el tiempo de existencia de la cuenta
            para poder actualizar la comisión mensual
            */
            isActivated()
        }
    }

    private fun isActivated() {
        if (saldo < 10000.0f) {
            cuentaActiva = false
        }
    }

    fun cerrarMes() {
        extractoMensual(0.0f)
    }

    fun imprimirDatos() {
        println("Saldo actual: $saldo")
        println("Tasa anual: $tasaAnual")
        println("Comision mensual: $comisionMensual")
        println("Cantidad de transacciones: ${numRetiros + numConsignaciones}")
    }
}