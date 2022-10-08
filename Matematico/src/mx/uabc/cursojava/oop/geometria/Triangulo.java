package mx.uabc.cursojava.oop.geometria;

public class Triangulo extends FiguraGeometricaConLados {
    public Triangulo(double base, double altura) {
        super.setBase(base);
        super.setAltura(altura);
    }

    @Override
    public double calcularArea() {
        double temp = super.calcularArea();
        return temp/2;
    }

    @Override
    public double otroCalculo() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "color=" + getColor() +
                "base=" + getBase() +
                ", altura=" + getAltura() +
                '}';
    }


    @Override
    public int compareTo(FiguraGeometrica o1) {
        return (int) (((Triangulo)o1).calcularArea() - this.calcularArea());
    }
}
