/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Lector;
import pe.edu.upeu.DeMiDependeUltimo.ServiceImpl.LectoresServiceImpl;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/lectores")
public class LectoresController {
    
    @Autowired
    private LectoresServiceImpl lectoresServiceImpl;
    
    @GetMapping("/listado")
    public String listarPedido(Model model){
        model.addAttribute("lectores", lectoresServiceImpl.readAll());
        return "lector/listarLectores";
    }
    
    @GetMapping("/form")
    public String crearPedido(Model model){
        model.addAttribute("titulo", "Registrar Lectores");
        model.addAttribute("lector", new Lector());
        return "lector/formLectores";
    }
    
    @PostMapping("/add")
    public String guardarPedido(@Valid @ModelAttribute Lector lectores, BindingResult result, Model model, RedirectAttributes attributes){
        lectoresServiceImpl.create(lectores);
        return "redirect:/lectores/listado";
    }
    
    @GetMapping("/del/{id}")
    public String eliminarPedido(Model model, @PathVariable("id") Long idLector){
        lectoresServiceImpl.delete(idLector);
        return "redirect:/lectores/listado";
    }
    
    @GetMapping("/edit/{id}")
    public String editarPedido(Model model, @PathVariable("id") Long idLector){
        Lector lector = lectoresServiceImpl.read(idLector);
        model.addAttribute("titulo","Modificar Lector");
        model.addAttribute("lector",lector);
        return "lector/formLectores";
    }
    
    @PostMapping("/{id}")
    public String leerLector(Model model, @PathVariable("id") Long idLector){
        model.addAttribute("lector", lectoresServiceImpl.read(idLector));
        return "redirect:/lector";
    }
}
