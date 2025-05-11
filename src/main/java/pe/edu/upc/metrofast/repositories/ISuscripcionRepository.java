package pe.edu.upc.metrofast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.metrofast.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {

    // Query de suscripciones de busqueda de Usuario
    @Query("SELECT s FROM Suscripcion s WHERE s.status = true AND s.usuarioid.userid = :userId")
    List<Suscripcion> findActiveSubscriptionsByUserId(@Param("userId") int userId);

    // Query de suscripciones que expiran durante este mes
    @Query ("SELECT s FROM Suscripcion s WHERE MONTH(s.enddate) = MONTH(CURRENT_DATE) AND YEAR(s.enddate) = YEAR(CURRENT_DATE)")
    List<Suscripcion> findSubscriptionsExpiringThisMonth();


}
