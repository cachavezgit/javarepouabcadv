package mx.uabc.cursojava.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Work implements Runnable {
    private final long countUntil;

    Work(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i=0;i<countUntil;i++) {
            sum +=1;
        }
        System.out.println(sum);
    }
}

public class MultiThreadDemo{
    private static final int HILOS = 10;

    public static void main (String args[]) throws Exception {
        ExecutorService ejecutor = Executors.newFixedThreadPool(HILOS);

        for (int i=0; i <500;i++) {
            Runnable tarea = new Work(1000000000L+i);
            ejecutor.execute(tarea);
        }

        ejecutor.shutdown();
        ejecutor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("La lista de tareas ha sido completada");

    }
    public static void mainOld(String args[]) {
        List<Thread> hilos = new ArrayList<>();

        for (int i=0; i <500;i++) {
            Runnable tarea = new Work(1000000000L+i);
            Thread trabajador = new Thread(tarea);

            trabajador.setName(String.valueOf(i));
            trabajador.start();
            hilos.add(trabajador);
        }

        int enEjecucion = 0;
        do {
            enEjecucion = 0;
            for (Thread t: hilos) {
                if (t.isAlive()) {
                    enEjecucion++;
                }
            }
            System.out.println(String.format("Hay %d threads en ejecucion", enEjecucion));
        } while (enEjecucion >0);
    }
}
