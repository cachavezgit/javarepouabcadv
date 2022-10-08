package mx.uabc.springdatajpa.springdatajpa.repositories;

import mx.uabc.springdatajpa.springdatajpa.entities.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
    List<Empleado> findEmpleadoByNombreContaining(String str);

    @Query("SELECT e from Empleado e WHERE LOWER(e.nombre) = lower(:n) ")
    List<Empleado> findEmpleadoByCustom(String n);
}
