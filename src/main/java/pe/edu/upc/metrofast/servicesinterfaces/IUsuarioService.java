package pe.edu.upc.metrofast.servicesinterfaces;

import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import pe.edu.upc.metrofast.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario> list();
    public void delete(int userid);
    public void update(Usuario usuario);
}
