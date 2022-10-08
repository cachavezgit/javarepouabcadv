package mx.uabc.cursojava.fundamentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Captura {
    public static void main(String[] args) throws Exception {
        short num1=0;
        short num2=0;

        /*BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String name = reader.readLine(); */

        Scanner in = new Scanner(System.in);
        System.out.println("Numero 1");
        num1 = in.nextShort();
        System.out.println("Numero 2");
        num2 = Short.parseShort(System.console().readLine());

        System.out.println(num1+num2);


    }
}
