package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Producto;
import pe.isil.service.ProductoService;
import pe.isil.service.ProveedorService;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/productos")
    public String productoList(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "productos";
    }

    @GetMapping("/productos/add")
    public String productoAdd(Model model){
        model.addAttribute("producto", new Producto());
        model.addAttribute("proveedores", proveedorService.findAll());
        return "productoAdd";
    }

    @GetMapping("/productos/edit/{id}")
    public String productoEdit(Model model, @PathVariable Integer id){
        model.addAttribute("producto", productoService.findById(id));
        return "productoAdd";
    }
    @PostMapping("/productos/save")
    public String productSave(Producto producto){
        productoService.create(producto);
        return "redirect:/productos";
    }

    @GetMapping("/productos/delete/{id}")
    public String productoDelete(Model model, @PathVariable Integer id){
        productoService.deleteById(id);
        return "redirect:/productos";
    }
}
