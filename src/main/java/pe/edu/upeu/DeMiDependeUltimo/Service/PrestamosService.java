/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.DeMiDependeUltimo.Service;

import pe.edu.upeu.DeMiDependeUltimo.Entity.Prestamo;
import pe.edu.upeu.DeMiDependeUltimo.Entity.PrestamosDto;

/**
 *
 * @author HP
 */
public interface PrestamosService {
    Prestamo registrarPrestamo(PrestamosDto prestamosDto);
}
