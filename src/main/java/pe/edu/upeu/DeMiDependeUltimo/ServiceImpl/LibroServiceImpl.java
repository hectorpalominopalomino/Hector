/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Libro;
import pe.edu.upeu.DeMiDependeUltimo.Repository.LibroRepository;
import pe.edu.upeu.DeMiDependeUltimo.Service.Operaciones;

/**
 *
 * @author HP
 */
@Service
public class LibroServiceImpl implements Operaciones<Libro>{

    @Autowired
    private LibroRepository libroRepo;

    @Override
    public Libro create(Libro t) {
        return libroRepo.save(t); 
    }

    @Override
    public Libro update(Libro t) {
        return libroRepo.save(t);
    }

    @Override
    public void delete(Long id) {
        libroRepo.deleteById(id);
    }

    @Override
    public Libro read(Long id) {
         return libroRepo.findById(id).get();
    }

    @Override
    public List<Libro> readAll() {
        return libroRepo.findAll();
    }
    
   
    
}
