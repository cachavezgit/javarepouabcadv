package mx.uabc.springdatajpa.springdatajpa.repositories;

import mx.uabc.springdatajpa.springdatajpa.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


public interface ProductoRepository extends CrudRepository<Producto,Long> {
    @Query(nativeQuery = true, value = "Select * from Producto p order by precio DESC LIMIT :maximo")
    List<Producto> findProductoByCustom(int maximo);
}
