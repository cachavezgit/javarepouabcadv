package mx.uabc.cursojava.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorNombres {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ricardo");
        nombres.add("Laura");
        nombres.add("Hugo");
        nombres.add("Olivia");
        nombres.add("Ana");

        ListIterator<String> iterator = nombres.listIterator();
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
            iterator.set(nombre.toUpperCase());
        }
        System.out.println(nombres);
    }

}
