package mx.uabc.cursojava.fundamentos;

import mx.uabc.cursojava.geometria.Circulo;
import mx.uabc.cursojava.geometria.Rectangulo;
import mx.uabc.cursojava.geometria.Triangulo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        // System.out.println(args[0]);
        // System.out.println(args[1]);

        Circulo c1 = new Circulo();
        Triangulo t1 = new Triangulo();
        Rectangulo r1= new Rectangulo();

        short datoNumerico = -32768;

        int datoEntero = 766552452;

        float datoFlotante = 45.45F;

        boolean flag = true;

        String emoji = "😀";
        char[] emojiCharacters = emoji.toCharArray();

        String cad1 = new String("prueba");
        String cad2 = new String("prueba");

        if (cad1.equals(cad2)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }

        int diasDelAño = 30;

        String meses = "";
        switch(diasDelAño) {
            case 28:
            case 29:
                System.out.println("Febrero");
                break;
            case 30:
                System.out.println("Abril, Junio, Septiembre, Noviembre");
                break;
            case 31:
                System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
                break;
            default:
                System.out.println("No es un mes valido");
        }

        String mes = "Junio";

        switch (mes) {
            case "Febrero":
                System.out.println("28 o 29");
                break;
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                System.out.println("30");
                break;
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":
            case "Diciembre":
                System.out.println("31");
                break;
            default:
                System.out.println("No es un mes válido");
        }

        String mensaje = "Este es un mensaje ";
        mensaje = mensaje + " que se está construyendo de forma ";
        mensaje += " de manera dinamica";

        StringBuilder sb = new StringBuilder();
        sb.append("Este es un mensaje ");
        sb.append(" que se esta construcyendo de forma ");
        sb.append(" dinamica");

        System.out.println(sb.toString());

        long enteromasGrande = Long.MAX_VALUE;
        System.out.println(enteromasGrande);

        BigInteger bi = BigInteger.valueOf(enteromasGrande);
        bi=bi.add(BigInteger.valueOf(enteromasGrande));

        System.out.println(bi.toString());

        BigDecimal bd=BigDecimal.valueOf(Double.MAX_VALUE);
        System.out.println(bd.toString());
        bd=bd.add(BigDecimal.valueOf(Double.MAX_VALUE));

        System.out.println(bd.toString());

    }
}
