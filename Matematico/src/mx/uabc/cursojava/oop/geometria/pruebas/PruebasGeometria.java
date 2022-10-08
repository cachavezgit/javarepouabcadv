package mx.uabc.cursojava.oop.geometria.pruebas;

import mx.uabc.cursojava.oop.geometria.Circulo;
import mx.uabc.cursojava.oop.geometria.FiguraGeometricaConLados;
import mx.uabc.cursojava.oop.geometria.Rectangulo;
import mx.uabc.cursojava.oop.geometria.Triangulo;

public class PruebasGeometria {
    public static void main(String [] args) {
        Triangulo t1 = new Triangulo(30, 50);
        t1. setColor("rojo");
        System.out.println(t1.calcularArea());

        Rectangulo r1 = new Rectangulo(30, 50);
        r1. setColor("verde");
        System.out.println(r1.calcularArea());

        Circulo c1 = new Circulo(10);
        c1. setColor("azul");
        System.out.println(c1.calcularArea());
        
    }
}
