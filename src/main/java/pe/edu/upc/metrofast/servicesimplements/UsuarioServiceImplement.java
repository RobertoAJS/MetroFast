package pe.edu.upc.metrofast.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.metrofast.entities.Usuario;
import pe.edu.upc.metrofast.repositories.IUsuarioRepository;
import pe.edu.upc.metrofast.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insertar(Usuario usuario){ uR.save(usuario); };
    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }
    @Override
    public void delete(int userid) {
        uR.deleteById(userid);
    }

    @Override
    public Usuario listId(int userid) {
            return uR.findById(userid).orElse(new Usuario());
    }






}
