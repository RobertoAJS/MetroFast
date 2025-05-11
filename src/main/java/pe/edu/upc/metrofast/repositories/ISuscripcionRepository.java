package pe.edu.upc.metrofast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.metrofast.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {




}
