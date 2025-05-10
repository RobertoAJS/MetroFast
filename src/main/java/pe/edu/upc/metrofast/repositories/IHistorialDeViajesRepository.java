package pe.edu.upc.metrofast.repositories;

import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistorialDeViajesRepository extends JpaRepository<HistorialDeViajes, Integer> {
}
