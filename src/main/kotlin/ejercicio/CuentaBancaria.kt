package ejercicio

open class CuentaBancaria(protected var saldo: Float, protected var tasaAnual: Float) {
    protected var numConsignaciones: Int = 0
    protected var numRetiros: Int = 0
    protected var comisionMensual: Float = 0.0f

    init {
        require(saldo >= 0) { "Error. El saldo no puede ser negativo." }
        require(tasaAnual in 0.0f..1.0f) { "Error. La tasa anual no es valida." }
    }

    open fun retirarDinero(monto: Float) {
        if (monto <= 0) {
            println("El monto a retirar no es valido.")
            return
        }

        if (monto > this.saldo) {
            println("Saldo insuficiente.\nMonto a retirar: $monto | Saldo: ${this.saldo}")
        } else {
            print("Saldo antes del retiro: ${this.saldo} | Monto a retirar: $monto | ")
            this.saldo -= monto
            numRetiros++
            println("Saldo despues del retiro: ${this.saldo}")
        }
    }

    open fun consignarDinero(monto: Float) {
        if (monto <= 0) {
            println("El monto a consignar no es valido.")
            return
        } else {
            this.saldo += monto
            this.numConsignaciones++
        }
    }

    fun calcularInteresMensual(): Float {
        val tasaMensual: Float = this.tasaAnual / 12.0f
        val interes: Float = this.saldo * tasaMensual
        this.saldo += interes
        return interes
    }

    open fun extractoMensual(comisionMensual: Float) {
        this.comisionMensual = comisionMensual
        saldo -= this.comisionMensual
        calcularInteresMensual()
    }

    fun obtenerSaldo(): Float = this.saldo
    fun obtenerTasaAnual(): Float = this.tasaAnual
    fun obtenerNumConsignaciones(): Int = this.numConsignaciones
    fun obtenerRetiros(): Int = this.numRetiros
    fun obtenerComisionMensual(): Float = this.comisionMensual
}