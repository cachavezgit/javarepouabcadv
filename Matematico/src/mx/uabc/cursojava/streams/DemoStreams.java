package mx.uabc.cursojava.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Empleado {
    private int clave;
    private String nombre;
    private double sueldo;

    public Empleado(int clave, String nombre, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void doblarSueldo() {
        this.sueldo *=2;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

public class DemoStreams {
    public static void main(String[] args) throws Exception {
        Empleado[] empleados = new Empleado[6];

        empleados[0] = new Empleado(1, "Wilson Perez", 12500);
        empleados[1] = new Empleado(2, "Lucia Manzur", 7000);
        empleados[2] = new Empleado(3, "Antonio Rodriguez", 1000);
        empleados[3] = new Empleado(4, "Marcos Rodriguez", 6000);
        empleados[4] = new Empleado(5, "Marcela Rodriguez", 8000);
        empleados[5] = new Empleado(6, "Bonifacia Rodriguez", 18000);

        // Stream<Empleado> streamEmpleados = Arrays.asList(empleados).stream();
        // streamEmpleados.forEach(e-> System.out.println(e));

        Arrays.asList(empleados).stream().forEach(e->System.out.println(e));

        Stream.of(empleados)
                .filter(e->e.getSueldo()> 13000)
                .collect(Collectors.toList())
                .forEach(e-> System.out.println(e));

        Empleado e1 = Stream.of(empleados)
                .filter(e -> e!=null)
                .filter(e -> e.getSueldo()>12000)
                .findFirst()
                .orElse(null);
        System.out.println(e1);

        System.out.println("------");
        Stream.of(empleados)
            .sorted(Comparator.comparing(Empleado::getSueldo).reversed())
                    .limit(3)
                            .forEach(System.out::println);

        System.out.println("------");
        Stream<Empleado> elStream = Stream.of(empleados);
        elStream.forEach(e->e.doblarSueldo());

        System.out.println("------");
        elStream = Stream.of(empleados);
        elStream.filter(e->e.getSueldo()>10000)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        elStream = Stream.of(empleados);
        Long cuantos =elStream.count();
        System.out.println(cuantos);

        List<Empleado> arrayList = Arrays.asList(empleados);

        Integer[] claves = {2,4,6};

        List<Empleado> filtrados = Stream.of(claves)
                .map(i-> i-1)
                .map(arrayList::get)
                .collect(Collectors.toList());

        for (Empleado e: filtrados){
            System.out.println(e);
        }

        Files.lines(Path.of("C:\\Users\\cachavez\\cursojava\\Matematico\\entrada.txt"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
