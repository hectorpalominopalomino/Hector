/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Entity;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Prestamos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    
    @Id
    @Column(name = "id_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "fecha_Salida")
    private Date fechaSalida;
    
    private Boolean estado;
    
    
    
    @ManyToOne
    @JoinColumn(name="idUsuario", nullable=false)
    private Usuario usuarios;
    
    @ManyToOne
    @JoinColumn(name="idLector", nullable=false)
    private Lector lectores;
    
    @OneToMany(mappedBy="prestamos")
    private Set<Detalle> detalles;
}
