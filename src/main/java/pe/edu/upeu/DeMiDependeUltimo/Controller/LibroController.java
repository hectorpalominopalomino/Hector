/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Libro;
import pe.edu.upeu.DeMiDependeUltimo.ServiceImpl.LibroServiceImpl;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private LibroServiceImpl libroServiceImpl;
    
    @GetMapping("/listado")
    public String listarPedido(Model model){
        model.addAttribute("libros", libroServiceImpl.readAll());
        return "libro/listarLibro";
    }
    
    @GetMapping("/form")
    public String crearPedido(Model model){
        model.addAttribute("titulo", "Registrar Libros");
        model.addAttribute("libro", new Libro());
        return "libro/formLibro";
    }
    
    @PostMapping("/add")
    public String guardarPedido(@Valid @ModelAttribute Libro libros, BindingResult result, Model model, RedirectAttributes attributes){
        libroServiceImpl.create(libros);
        return "redirect:/libros/listado";
    }
    
    @GetMapping("/del/{id}")
    public String eliminarPedido(Model model, @PathVariable("id") Long idLibro){
        libroServiceImpl.delete(idLibro);
        return "redirect:/libros/listado";
    }
    
    @GetMapping("/edit/{id}")
    public String editarPedido(Model model, @PathVariable("id") Long idLibro){
        Libro libro = libroServiceImpl.read(idLibro);
        model.addAttribute("titulo","Modificar libro");
        model.addAttribute("libro",libro);
        return "libro/formLibro";
    }
    
    @PostMapping("/{id}")
    public String leerLibro(Model model, @PathVariable("id") Long idLibro){
        model.addAttribute("libro", libroServiceImpl.read(idLibro));
        return "redirect:/libro";
    }
}
