package mx.uabc.springdatajpa.springdatajpa;

import mx.uabc.springdatajpa.springdatajpa.entities.Empleado;
import mx.uabc.springdatajpa.springdatajpa.entities.Producto;
import mx.uabc.springdatajpa.springdatajpa.repositories.EmpleadoRepository;
import mx.uabc.springdatajpa.springdatajpa.repositories.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    private void insertarEmpleados(EmpleadoRepository repository) {
        repository.save(new Empleado("Wilson Perez", 87609));
        repository.save(new Empleado("Lucia Rodriguez", 23454));
    }

    private void insertarProductos(ProductoRepository repository) {
        repository.save(new Producto("Producto 1", 87609));
        repository.save(new Producto("Producto 2", 23));
        repository.save(new Producto("Producto 3", 37609));
        repository.save(new Producto("Producto 4", 57609));
        repository.save(new Producto("Producto 5", 17609));

    }


    @Order(value = 2)
    public CommandLineRunner run(EmpleadoRepository repository) {
        return (args) -> {
            insertarEmpleados(repository);
            System.out.println(repository.findAll());
            System.out.println(repository.findEmpleadoByNombreContaining("Rod"));
            System.out.println(repository.findEmpleadoByCustom("wilson perez"));
        };
    }

    @Bean
    @Order(value = 1)
    public CommandLineRunner run(ProductoRepository repository) {
        return (args) -> {
            repository.deleteAll();
            insertarProductos(repository);
            System.out.println(repository.findProductoByCustom(2));
        };
    }
}
