package pe.edu.upc.metrofast.repositories;


import pe.edu.upc.metrofast.entities.ViajeProgramado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViajeProgramadoRepository  extends JpaRepository<ViajeProgramado, Integer> {
}
