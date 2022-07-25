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
@Table(name = "Detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detalle {
    
    @Id
    @Column(name = "id_detalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private Date fechaDevo;
    
    private int mora;
    
    private Boolean devuelto;
    
    @ManyToOne
    @JoinColumn(name="idPrestamo", nullable=false)
    private Prestamo prestamos;
    
    @ManyToOne
    @JoinColumn(name="idLibro", nullable=false)
    private Libro libros;
}
