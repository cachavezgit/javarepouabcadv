package mx.uabc.cursojava.exceptions.banco;

import mx.uabc.cursojava.exceptions.CuentaBancaria;
import mx.uabc.cursojava.exceptions.SobregiroException;

public class PruebaClaseCB {
    public static void main(String[] args)  {
        CuentaBancaria cb1=new CuentaBancaria();

        try {
            cb1.retiro(15000);
        }
        catch(SobregiroException ex) {
            ex.printStackTrace();
        }

    }
}
