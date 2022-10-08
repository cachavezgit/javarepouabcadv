package mx.uabc.cursojava.colecciones;

import java.util.*;

public class PruebasColecciones {
    public static void main(String args[]) {
        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(9);
        numeros.add(2434);
        numeros.add(9);

        for (Integer x:numeros) {
            System.out.println(x);
        }

        String[] cadenasArray =new String[]{"4","6","8","10","12"};
        List<String> cadenasLista = Arrays.asList(cadenasArray);
        System.out.println(cadenasLista);
        cadenasLista.remove("10");
        List<String> numerosLista2 = new ArrayList<>();
        numerosLista2.add("4");
        numerosLista2.add("6");
        numerosLista2.remove("6");
        System.out.println(numerosLista2);
    }
}
