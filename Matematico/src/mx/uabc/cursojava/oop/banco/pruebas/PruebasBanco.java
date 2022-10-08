package mx.uabc.cursojava.oop.banco.pruebas;

import mx.uabc.cursojava.oop.banco.Cliente;
import mx.uabc.cursojava.oop.banco.CuentaBancaria;
import mx.uabc.cursojava.oop.banco.TipoCuenta;

public class PruebasBanco {
    public static void main (String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria();
        CuentaBancaria cb2 = new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria(80000);
        CuentaBancaria cb4 = new CuentaBancaria(78333, TipoCuenta.CHEQUES);

        Cliente c1 = new Cliente("Juan", "Perez Perez");

        cb1.setCuentaHabiente(c1);
        cb2.setCuentaHabiente(c1);
        cb3.setCuentaHabiente(c1);

        System.out.println(cb1.getSaldo());
        cb1.depositar(50000);
        System.out.println(cb1.getSaldo());

        System.out.println(cb2.getSaldo());
        cb2.depositar(450000);
        cb2.retirar(30000);
        System.out.println(cb2.getSaldo());

        System.out.println(cb3.getSaldo());

        System.out.println(cb4);

    }
}
