package mx.uabc.cursojava.oop.geometria;

public class Rectangulo extends FiguraGeometricaConLados {
    public Rectangulo(double base, double altura) {
        super.setBase(base);
        super.setAltura(altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color=" + getColor() +
                "base=" + getBase() +
                ", altura=" + getAltura() +
                ", area=" + calcularArea() +
                '}';
    }

    @Override
    public double otroCalculo() {
        return 0;
    }


    @Override
    public int compareTo(FiguraGeometrica o1) {
        return (int) (((Rectangulo)o1).calcularArea() - this.calcularArea());
    }
}
