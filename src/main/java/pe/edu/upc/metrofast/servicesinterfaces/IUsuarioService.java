package pe.edu.upc.metrofast.servicesinterfaces;

import pe.edu.upc.metrofast.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insertar(Usuario usuario);
    public List<Usuario> list();

    public void delete(int userid);

    public Usuario listId(int userid);


}
