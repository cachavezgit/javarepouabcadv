package mx.uabc.cursojava.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap();
        mapa.put(1,"Uno" );
        mapa.put(2,"Dos" );
        mapa.put(3,"Tres" );
        mapa.put(4,"Cuatro" );
        mapa.put(5,"Cinco" );
        mapa.put(5,"Seis" );
        Set<Integer> llaves =mapa.keySet();
        String x=mapa.get(5);
        System.out.println(llaves);
        System.out.println(x);
        Set<Map.Entry<Integer,String>> resultado2 = mapa.entrySet();
        System.out.println(resultado2);

    }
}
