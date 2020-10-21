package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Proveedor;
import pe.isil.repository.ProductoRespository;
import pe.isil.repository.ProveedorRespository;

import java.util.List;

@Service
public class ProveedorService implements BaseService<Proveedor, Integer> {

    @Autowired
    private ProveedorRespository proveedorRespository;

    @Override
    public void create(Proveedor proveedor) {
        proveedorRespository.save(proveedor);
    }

    @Override
    public void update(Proveedor proveedor) {
        proveedorRespository.save(proveedor);
    }

    @Override
    public void deleteById(Integer id) {
        proveedorRespository.deleteById(id);
    }

    @Override
    public List<Proveedor> findAll() {
        return proveedorRespository.findAll();
    }

    @Override
    public Proveedor findById(Integer id) {
        return proveedorRespository.findById(id).orElse(null);
    }
}
