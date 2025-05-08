package pe.edu.upc.metrofast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.metrofast.entities.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
