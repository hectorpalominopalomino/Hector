/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Lector")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lector {
    
    @Id
    @Column(name = "id_lector")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombres;
    
    private String apellidos;
    
    private String dni;
    
    private String telefono;
    
    private String correo;
    
    private Boolean estado;
    
    @OneToMany(mappedBy="lectores")
    private Set<Prestamo> prestamos;
}
