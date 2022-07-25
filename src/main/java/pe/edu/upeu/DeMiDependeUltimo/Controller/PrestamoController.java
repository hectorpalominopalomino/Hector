/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Prestamo;
import pe.edu.upeu.DeMiDependeUltimo.Entity.PrestamosDto;
import pe.edu.upeu.DeMiDependeUltimo.Service.PrestamosService;
import pe.edu.upeu.DeMiDependeUltimo.ServiceImpl.LectoresServiceImpl;
import pe.edu.upeu.DeMiDependeUltimo.ServiceImpl.LibroServiceImpl;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/prestamo")
public class PrestamoController {
    
    @Autowired
    private LectoresServiceImpl lectorService;
    
    @Autowired
    private LibroServiceImpl libroService;
    
    @GetMapping("/prestamoLector")
    public String PrestamoLector(Model model){
        model.addAttribute("listaLectores", lectorService.readAll());
        model.addAttribute("listaLibros", libroService.readAll());
        model.addAttribute("prestamoDto", new PrestamosDto());
        return "prestamo/listarPrestamo";
    }
    
}
