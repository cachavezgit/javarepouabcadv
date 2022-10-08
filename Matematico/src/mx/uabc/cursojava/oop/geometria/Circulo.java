package mx.uabc.cursojava.oop.geometria;

public class Circulo extends FigurasGeometricasRedondas {
    public Circulo(double diametro) {
        setDiametro(diametro);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(getDiametro()/2,2);
    }


    @Override
    public int compareTo(FiguraGeometrica o1) {
        return (int) (((Circulo)o1).calcularArea() - this.calcularArea());
    }
}
