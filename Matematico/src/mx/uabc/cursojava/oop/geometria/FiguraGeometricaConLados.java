package mx.uabc.cursojava.oop.geometria;

public abstract class FiguraGeometricaConLados extends FiguraGeometrica {
    private double base;

    private double altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }

    public abstract double otroCalculo();
}
