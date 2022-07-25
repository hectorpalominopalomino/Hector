/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Lector;
import pe.edu.upeu.DeMiDependeUltimo.Repository.LectoresRepository;
import pe.edu.upeu.DeMiDependeUltimo.Service.Operaciones;

/**
 *
 * @author HP
 */
@Service
public class LectoresServiceImpl implements Operaciones<Lector>{

    @Autowired
    private LectoresRepository lectoresRepo;

    @Override
    public Lector create(Lector t) {
       return lectoresRepo.save(t);
    }

    @Override
    public Lector update(Lector t) {
        return lectoresRepo.save(t);
    }

    @Override
    public void delete(Long id) {
        lectoresRepo.deleteById(id);
    }

    @Override
    public Lector read(Long id) {
         return lectoresRepo.findById(id).get();
    }

    @Override
    public List<Lector> readAll() {
        return lectoresRepo.findAll();
    }
    
    
    
}
