package pe.edu.upc.metrofast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.metrofast.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

public interface IUsuarioRepository extends JpaRepository <Usuario, Integer>{


    // Buscar usuarios creados despues de cierta fecha
    @Query("SELECT u FROM Usuario u WHERE u.createat > :fecha")
    List<Usuario> findUsersCreatedAfter(@Param("fecha") LocalDate fecha);

    //Contar usuario con número de teléfono que empieza con cierto dígito:
    @Query("SELECT COUNT(u) FROM Usuario u WHERE CAST(u.phonenumber AS string) LIKE CONCAT(:digito, '%')")
    Long countUsersByPhonePrefix(@Param("digito") String digito);




}
