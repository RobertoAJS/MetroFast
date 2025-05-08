package pe.edu.upc.metrofast.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import pe.edu.upc.metrofast.entities.ViajeProgramado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IViajeProgramadoRepository  extends JpaRepository<ViajeProgramado, Integer> {

        @Query("SELECT a FROM ViajeProgramado a WHERE a.tripdate =:fecha")
        public List<ViajeProgramado> buscarPorFecha(@Param("fecha") LocalDate fecha);
}
