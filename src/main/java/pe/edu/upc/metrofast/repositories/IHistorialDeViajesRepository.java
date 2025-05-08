package pe.edu.upc.metrofast.repositories;


import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHistorialDeViajesRepository extends JpaRepository<HistorialDeViajes, Integer> {

    @Query(value= "SELECT u.username, SUM(h.totalamount) AS monto_total\n" +
            "FROM Historial_De_Viajes h\n" +
            "JOIN Viaje_Programado v ON h.tripid = v.tripid\n" +
            "JOIN Usuario u ON v.userid = u.userid\n" +
            "GROUP BY u.username", nativeQuery = true)
    List<String[]>quantitybyUsername();


}
