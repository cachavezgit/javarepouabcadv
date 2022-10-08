package mx.uabc.cursojava.fundamentos;

import java.util.Arrays;
import java.util.List;

public class ProcesarLineaDeComando {
    public static void main(String args[]){
        List<String> numeros = Arrays.asList(args);

        for(String numero:numeros){
            int num = Integer.parseInt(numero);
            if (num % 2 != 0) {
                System.out.println(String.format("El numero %d es non", num));
            }
        }

        for(String n:args) {
            int num = Integer.parseInt(n);
            if (num % 2 != 0) {
                System.out.println(String.format("El numero %d es non", num));
            }
        }

        Arrays.stream(args).map(Integer::parseInt).filter(i -> i % 2 != 0).forEach(System.out::println);

    }
}
