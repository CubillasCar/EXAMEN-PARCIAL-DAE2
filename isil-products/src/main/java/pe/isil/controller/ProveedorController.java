package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Proveedor;
import pe.isil.service.ProveedorService;

@Controller
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/proveedores")
    public String proveedorList(Model model){
        model.addAttribute("proveedores",proveedorService.findAll());
        return "proveedores";
    }

    @GetMapping("/proveedores/add")
    public String proveedorAdd(Model model){
        model.addAttribute("proveedor", new Proveedor());
        return "proveedorAdd";
    }

    @GetMapping("/proveedores/edit/{id}")
    public String proveedorEdit(Model model, @PathVariable Integer id){
        model.addAttribute("proveedor", proveedorService.findById(id));
        return "proveedorAdd";
    }

    @PostMapping("/proveedores/save")
    public String proveedorSave(Proveedor proveedor){
        proveedorService.create(proveedor);
        return "redirect:/proveedores";
    }
    @GetMapping("/proveedores/delete/{id}")
    public String proveedorDelete( @PathVariable Integer id){
        proveedorService.deleteById(id);
        return "redirect:/proveedores";
    }
}

