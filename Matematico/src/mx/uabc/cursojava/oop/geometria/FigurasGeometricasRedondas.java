package mx.uabc.cursojava.oop.geometria;

import mx.uabc.cursojava.oop.geometria.FiguraGeometrica;

public abstract class FigurasGeometricasRedondas extends FiguraGeometrica {
    private double diametro;

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
