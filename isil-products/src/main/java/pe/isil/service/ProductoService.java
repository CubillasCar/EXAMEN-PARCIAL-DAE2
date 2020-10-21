package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Producto;
import pe.isil.repository.ProductoRespository;
import pe.isil.repository.ProveedorRespository;

import java.util.List;

@Service
public class ProductoService implements BaseService<Producto, Integer> {

    @Autowired
    private ProductoRespository productoRespository;

    @Override
    public void create(Producto producto) {
        productoRespository.save(producto);
    }

    @Override
    public void update(Producto producto) {
        productoRespository.save(producto);
    }

    @Override
    public void deleteById(Integer id) {
        productoRespository.deleteById(id);
    }

    @Override
    public List<Producto> findAll() {
        return productoRespository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return productoRespository.findById(id).orElse(null);
    }
}
