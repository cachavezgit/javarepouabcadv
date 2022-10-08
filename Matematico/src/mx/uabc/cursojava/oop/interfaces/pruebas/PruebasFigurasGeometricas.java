package mx.uabc.cursojava.oop.interfaces.pruebas;

import mx.uabc.cursojava.oop.interfaces.*;

public class PruebasFigurasGeometricas {
    public static void main (String[] args) {
        IFiguraGeometrica c1 = new Circulo();
        IFiguraGeometrica t1 = new Triangulo();

        ((IFigurasRedondas)c1).calcularRadio();

        procesaFigura(c1);
        procesaFigura(t1);

        CirculoMejorado cm1 = new CirculoMejorado();
        cm1.setColor("verde");
    }

    public static void procesaFigura(IFiguraGeometrica fig) {

    }
}
