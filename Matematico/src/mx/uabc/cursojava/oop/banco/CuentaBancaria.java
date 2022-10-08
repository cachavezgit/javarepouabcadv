package mx.uabc.cursojava.oop.banco;

/**
 * Clase para representar una cuenta bancaria
 * que puede ser de tipo Inversion, Cheques, Credito
 */
public class CuentaBancaria {
    private Cliente cuentaHabiente;
    // Fields
    /**
     * Este campo tiene tal proposito
     */
    private double saldo;

    private TipoCuenta tipoCuenta;

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Cliente getCuentaHabiente() {
        return cuentaHabiente;
    }

    public void setCuentaHabiente(Cliente cuentaHabiente) {
        this.cuentaHabiente = cuentaHabiente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Constructores
    public CuentaBancaria () {
        System.out.println("Se creo una cuenta bancaria");
    }

    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public CuentaBancaria(double saldo, TipoCuenta tipoCuenta) {
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Métodos

    /**
     * Metodo para incrementar el saldo de una cuenta
     * @param cantidad cantidad a adicionar a la cuenta
     */
    public void depositar(double cantidad) {
        saldo+=cantidad;
    }

    public void retirar(double cantidad) {
        saldo-=cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cuentaHabiente=" + cuentaHabiente +
                ", saldo=" + saldo +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }
}
