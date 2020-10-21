package pe.isil.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.isil.model.Producto;
import pe.isil.model.Proveedor;

@SpringBootTest
public class ProductoProjectTest {

    @Autowired
    ProductoRespository productoRespository;

    @Autowired
    ProveedorRespository proveedorRespository;

    @Test
    void productoProveedorInsertTest(){

        Proveedor proveedor =new Proveedor();
        proveedor.setRuc("1234567890");
        proveedor.setNombre("Sansung");
        proveedor.setEmail("Samsung@samsung.com");
        proveedor.setTelefono("14584112");

        Producto producto = new Producto();
        producto.setSku("01233654");
        producto.setNombre("S-x10");
        producto.setStock(100);
        producto.setPrecio(800);
        producto.setProveedorId(1);
        producto.setProveedor(proveedor);


        productoRespository.save(producto);
        proveedorRespository.save(proveedor);


    }










}
