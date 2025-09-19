package ejercicio

class CuentaCorriente(saldo: Float, tasaAnual: Float,
                      var sobregiro: Float = 0.0f): CuentaBancaria(saldo, tasaAnual){

    override fun retirarDinero(monto: Float) {
        if (monto<= 0) {
            println("El monto a retirar no es valido")
            return
        }

        if (monto >this.saldo) {
            val diferencia = monto - this.saldo
            println("Saldo insuficiente... Se genera un sobregiro de $diferencia")
            sobregiro += diferencia
            this.saldo = 0.0f
        } else {
            super.retirarDinero(monto)
        }
    }

    override fun consignarDinero(monto: Float) {
        if (monto <= 0) {
            println("El monto a consignar no es valido...")
            return
        }

        if (sobregiro > 0) {
            if (monto >= sobregiro) {
                val excedente = monto - sobregiro
                println("Se paga el sobregiro de $sobregiro con la consignacion")
                sobregiro = 0.0f
                super.consignarDinero(excedente)
            } else {
                sobregiro -= monto
                println("Monto consignado aplicado solo para pagar sobregiro. El sobregiro restante es: $sobregiro")
            }
        } else {
            super.consignarDinero(monto)
        }
    }


    override fun extractoMensual(comisionMensual: Float){
        super.extractoMensual(comisionMensual)
    }

    fun cerrarMes() {
        extractoMensual(0.0f)
    }


    fun imprimirDatos() {
        println("-------------------------------")
        println("Saldo actual: $saldo")
        println("Tasa anual: $tasaAnual")
        println("Comision mensual: $comisionMensual")
        println("Numero de transacciones: ${numRetiros + numConsignaciones}")
        println("Sobregiro: $sobregiro")
        println("-------------------------------")
    }
}
