package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Producto;

@Repository
public interface ProductoRespository extends JpaRepository<Producto, Integer> {
}
