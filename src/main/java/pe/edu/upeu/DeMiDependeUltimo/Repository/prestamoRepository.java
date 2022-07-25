/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Prestamo;

/**
 *
 * @author HP
 */
public interface prestamoRepository extends JpaRepository<Prestamo, Long>{
    
}
