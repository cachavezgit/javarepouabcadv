package mx.uabc.cursojava.oop.interfaces;

public class CirculoMejorado extends Circulo {
    @Override
    public void setColor(String codigoColor) {
        System.out.println("Se cambió el color en circulo mejorado...");
        super.setColor("verde");
    }
}
