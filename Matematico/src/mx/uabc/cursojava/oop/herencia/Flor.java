package mx.uabc.cursojava.oop.herencia;

public abstract class Flor {
    private String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Flor() {
        System.out.println("Se creo una flor");
    }
    protected void fotoSintesis() {
        System.out.println("Proceso de fotosintesis");
    }

    public void imprimeInfoFlor(){
        System.out.println("Esta es una flor genérica");
    }

    public int calculo(int a){
        return a * a;
    }
}
