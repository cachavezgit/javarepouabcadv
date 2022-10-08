package mx.uabc.cursojava.lambdaexpressions;

interface IRevisaNumeroPrimo {
    public boolean esPrimo(int num);

}

public class EvaluaNumerosPrimosLambda {
    public static void main(String[] args) {

        IRevisaNumeroPrimo prueba = ((num) ->{
            int vueltas = (int)Math.sqrt(num);
            for(int contador=2;contador<=vueltas;contador++) {
                if (num%contador == 0) {
                    return false;
                }
            }
            return true;
        });

        System.out.println(String.format("El numero %d es primo: %b", 2, prueba.esPrimo(2)));
        System.out.println(String.format("El numero %d es primo: %b", 3, prueba.esPrimo(3)));
        System.out.println(String.format("El numero %d es primo: %b", 743, prueba.esPrimo(743)));
        System.out.println(String.format("El numero %d es primo: %b", 216547687, prueba.esPrimo(216547687)));
        System.out.println(String.format("El numero %d es primo: %b", 6, prueba.esPrimo(6)));
    }
}
