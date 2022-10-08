package mx.uabc.cursojava.colecciones;

import mx.uabc.cursojava.oop.geometria.Rectangulo;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenaArregloRectangulos {
    public static void main (String args[]) {
        Rectangulo[] losRectangulos = new Rectangulo[5];

        losRectangulos[0] = new Rectangulo(100,40);
        losRectangulos[1] = new Rectangulo(10,6);
        losRectangulos[2] = new Rectangulo(2,1);
        losRectangulos[3] = new Rectangulo(1000,400);
        losRectangulos[4] = new Rectangulo(1200,800);

        Arrays.sort(losRectangulos, (o1, o2) -> 0);

        Arrays.sort(losRectangulos, (o1, o2) -> {
            return (int) (o2.calcularArea() - o1.calcularArea());
        });

        for(Rectangulo r:losRectangulos) {
            System.out.println(r);
        }

    }
}
