package mx.uabc.cursojava.fundamentos;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class LectorDeCadenas {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\cachavez\\cursojava\\Matematico\\entrada.txt");
        Scanner scanner = new Scanner(fis);

        int longitudGanadora = 0;
        String cadenaMasLarga = "";
        /*
        while(scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();

            if (nextLine.length()>10){
                System.out.println(nextLine);

                if (nextLine.length() > longitudGanadora) {
                    longitudGanadora = nextLine.length();
                    cadenaMasLarga = nextLine;

                longitudGanadora = (nextLine.length() > longitudGanadora)?nextLine.length():longitudGanadora;
                cadenaMasLarga = (nextLine.length() > longitudGanadora)?nextLine:cadenaMasLarga;
            }
        } */

        List<String> lineas = Files.readAllLines(Path.of("C:\\Users\\cachavez\\cursojava\\Matematico\\entrada.txt"));
        for(String nextLine:lineas) {
            if (nextLine.length() <= 10) {
                continue;
            }

            System.out.println(nextLine);

            if (nextLine.length() > longitudGanadora) {
                longitudGanadora = nextLine.length();
                cadenaMasLarga = nextLine;

                longitudGanadora = (nextLine.length() > longitudGanadora) ? nextLine.length() : longitudGanadora;
                cadenaMasLarga = (nextLine.length() > longitudGanadora) ? nextLine : cadenaMasLarga;
            }

        }

        System.out.println("La cadena de mayor longitud es:");
        System.out.println(cadenaMasLarga);

        scanner.close();
        fis.close();
    }
}
