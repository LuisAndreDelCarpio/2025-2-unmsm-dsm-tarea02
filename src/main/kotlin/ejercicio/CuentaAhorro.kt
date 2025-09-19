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

        var comisionCalculada = 0.0f

        if (numRetiros > 4) {
            val retirosExtra = numRetiros - 4
            comisionCalculada = retirosExtra * 1000.0f
        }

        super.extractoMensual(comisionCalculada)
        isActivated()
    }


    private fun isActivated() {
//        if (saldo < 10000.0f) {
//            cuentaActiva = false
//        }
        cuentaActiva = saldo >= 10000.0f // ahora actualizamos para ambos sentidos
        /*
        * si saldo es menor que 10k se pone cuentaActiva = false
        * si saldo es igual o mayor a 10k se pone cuentaActiva = true
        * */
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