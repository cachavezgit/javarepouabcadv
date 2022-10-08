package mx.uabc.cursojava.oop.interfaces;

public class Circulo implements IFiguraGeometrica, IFigurasRedondas {
    @Override
    public void setColor(String codigoColor) {
        System.out.println("Se cambió el color...");
    }

    @Override
    public double calcularArea() {
        return 10;
    }

    @Override
    public double calcularPerimetro() {
        return 20;
    }

    @Override
    public double calcularRadio() {
        return 5;
    }
}
