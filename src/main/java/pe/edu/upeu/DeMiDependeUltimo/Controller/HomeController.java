/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HP
 */
@Controller
public class HomeController {
    
    @GetMapping
    public String inicio(){
        return "inicio";
    }
    
    @GetMapping("/libros")
    public String menuLibros(){
        return "libro/listarLibro";
    }
    @GetMapping("/lectores")
    public String menuLectores(){
        return "lector/listarLectores";
    }
    
    @GetMapping("/prestamos")
    public String prestamos(){
        return "prestamo/detalle";
    }
}
