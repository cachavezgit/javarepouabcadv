package mx.uabc.cursojava.oop.herencia.pruebas;

import mx.uabc.cursojava.oop.herencia.Flor;
import mx.uabc.cursojava.oop.herencia.Girasol;
import mx.uabc.cursojava.oop.herencia.GirasolExotico;

public class PruebaHerencia {
    public static void main(String[] args) {
        //Flor f1 = new Flor();
        //f1.imprimeInfoFlor();
        Girasol g1 = new Girasol();
        g1.imprimeInfoFlor();
        g1.Prueba();
        g1.setNombre("Girasol");
        System.out.println(g1.getNombre());

        System.out.println(g1.calculo(9));
        System.out.println(g1.calculo(9, 8));

        GirasolExotico ge1= new GirasolExotico();
        System.out.println(ge1.calculo(9));
        System.out.println(ge1.calculo(9, 8));

        Flor f2 = new GirasolExotico(); // f1 puede tomar multiples formas

        ((GirasolExotico)f2).metodoExotico();

        ProcesaFlor(g1);
        ProcesaFlor(ge1);

    }

    public static void ProcesaFlor(Flor flor) {

    }
}
