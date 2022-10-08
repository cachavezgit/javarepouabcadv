package mx.uabc.cursojava.colecciones;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProcesarArchivoLineaALineaUsandoArreglo {
    public static void main(String[] args) throws Exception {
        String[] lineas = new String[100];

        FileInputStream fis = new FileInputStream("C:\\Users\\cachavez\\cursojava\\Matematico\\src\\mx\\uabc\\cursojava\\oop\\colecciones\\entrada.txt");
        Scanner scanner = new Scanner(fis);

        int contador = 0;
        while (scanner.hasNext()) {
            String linea = scanner.nextLine();
            lineas[contador] = linea.trim().toUpperCase();
            contador++;
        }

        for(String linea:lineas){
            System.out.println(linea);
        }

        Arrays.sort(lineas, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null && o2 == null){
                    return 0;
                }
                if (o1 == null){
                    return 1;
                }
                if (o2 == null){
                    return -1;
                }
                return o1.compareTo(o2);
            }
        });

        for(String linea:lineas){
            System.out.println(linea);
        }
    }
}
