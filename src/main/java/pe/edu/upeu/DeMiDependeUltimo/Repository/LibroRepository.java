/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Libro;

/**
 *
 * @author HP
 */
public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}
