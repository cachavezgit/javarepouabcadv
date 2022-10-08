package mx.uabc.cursojava.colecciones;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class InfoPalabra {
    private String palabra;
    private int numeroDeVeces;

    public InfoPalabra(String palabra, int numeroDeVeces) {
        this.palabra = palabra;
        this.numeroDeVeces = numeroDeVeces;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getNumeroDeVeces() {
        return numeroDeVeces;
    }

    public void setNumeroDeVeces(int numeroDeVeces) {
        this.numeroDeVeces = numeroDeVeces;
    }

    @Override
    public String toString() {
        return "InfoPalabra{" +
                "palabra='" + palabra + '\'' +
                ", numeroDeVeces=" + numeroDeVeces +
                '}';
    }
}

public class PalabrasRepetidasArchivoColecciones {
    public static void main (String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\cachavez\\cursojava\\Matematico\\src\\mx\\uabc\\cursojava\\oop\\colecciones\\entrada.txt");
        Scanner scanner = new Scanner(fis);

        Map<String, InfoPalabra> mapaInfoPalabras = new HashMap<>();

        while (scanner.hasNext()) {
            String linea = scanner.nextLine();
            String[] palabras = linea.split(" ");
            for(String palabra:palabras) {
                if (mapaInfoPalabras.containsKey(palabra)) {
                    InfoPalabra infoPalabra = mapaInfoPalabras.get(palabra);
                    int numeroDeVeces=infoPalabra.getNumeroDeVeces();
                    infoPalabra.setNumeroDeVeces(++numeroDeVeces);
                    mapaInfoPalabras.put(palabra, infoPalabra);
                } else {
                    mapaInfoPalabras.put(palabra, new InfoPalabra(palabra,1));
                }
            }
        }
        fis.close();
        scanner.close();

        Iterator<Map.Entry<String,InfoPalabra>> iterator = mapaInfoPalabras.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,InfoPalabra> entrada=iterator.next();
            int noVeces = entrada.getValue().getNumeroDeVeces();
            if (noVeces >1)
                System.out.println(String.format("La palabra %s se encuentra %d en el documento",
                        entrada.getValue().getPalabra(), noVeces));
        }
    }
}
