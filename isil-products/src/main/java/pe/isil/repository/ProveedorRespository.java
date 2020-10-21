package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Proveedor;

@Repository
public interface ProveedorRespository  extends JpaRepository<Proveedor, Integer> {
}