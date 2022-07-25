/*
package pe.edu.upeu.DeMiDependeUltimo.ServiceImpl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Lector;
import pe.edu.upeu.DeMiDependeUltimo.Entity.Prestamo;
import pe.edu.upeu.DeMiDependeUltimo.Entity.PrestamosDto;
import pe.edu.upeu.DeMiDependeUltimo.Repository.LectoresRepository;
import pe.edu.upeu.DeMiDependeUltimo.Repository.prestamoRepository;
import pe.edu.upeu.DeMiDependeUltimo.Service.PrestamosService;


@Service
public class PrestamoServiceImpl implements PrestamosService{

    @Autowired
    private LectoresRepository lectoresRepo;
    
    @Autowired
    private prestamoRepository prestamosRepo;
    
    @Override
    public Prestamo registrarPrestamo(PrestamosDto prestamosDto) {
        Prestamo prestamo = new Prestamo();
        
        Lector lector = lectoresRepo.findById(prestamosDto.getNombres()).orElse(null);
        
        prestamo.setLectores(lector);
        prestamo.setFechaSalida(new Date());
        
        return prestamosRepo.save(prestamo);
    }
    
}*/
