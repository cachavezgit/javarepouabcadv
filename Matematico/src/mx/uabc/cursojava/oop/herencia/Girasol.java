package mx.uabc.cursojava.oop.herencia;

public class Girasol extends Flor {
    public Girasol() {
        System.out.println("Se creo un girasol");

    }

    public void Prueba() {
        this.fotoSintesis();
    }

    @Override
    public void imprimeInfoFlor(){
        System.out.println("Esta es un girasol");
    }

    public int calculo (int a, int b){
        return a*b;
    }

}
