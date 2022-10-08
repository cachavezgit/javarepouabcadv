package mx.uabc.cursojava.exceptions;



public class CuentaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retiro(double cantidad) throws SobregiroException {
        this.saldo -= cantidad;

        if (this.saldo<0) {
            throw new SobregiroException("La cuenta se sobregiro");
        }
    }

    public CuentaBancaria() {

    }

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
}
