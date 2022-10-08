package mx.uabc.cursojava.multithread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        CompletableFuture<String> cuentaFutura = crearCompletableFuture()
                .thenApply((Integer cuenta) -> {
                    int calculo = cuenta + 10;
                    return calculo;
                }).thenApply(calculo -> "El resultado es: "+calculo);

        System.out.println(String.format("Han pasado %d milisegundos", inicio-System.currentTimeMillis()));

        try {
            System.out.println(cuentaFutura.get()); // En este punto es donde se inicia la ejecucion
            System.out.println(String.format("Se tardo %d milisegundos en completarla", inicio-System.currentTimeMillis()));
        }
        catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
        System.out.println("Mensaje");
    }


    private static CompletableFuture<Integer> crearCompletableFuture() {
        CompletableFuture<Integer> cuentaFutura = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    return 20;
                });
        return cuentaFutura;
    }
}

