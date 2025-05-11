package pe.edu.upc.metrofast.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.metrofast.entities.Suscripcion;
import pe.edu.upc.metrofast.repositories.ISuscripcionRepository;
import pe.edu.upc.metrofast.servicesinterfaces.ISuscripcionService;

import java.util.List;

@Service
public class SuscripcionServiceImplement implements ISuscripcionService {

    @Autowired
    private ISuscripcionRepository sR;

    @Override
    public void insertar(Suscripcion suscripcion) {
        sR.save(suscripcion);

    }

    @Override
    public void update(Suscripcion suscripcion){
        sR.save(suscripcion);
    };
    @Override
    public void delete(int suscriptionId){

    };
    @Override
    public List<Suscripcion> list(){

        return sR.findAll();
    };

    @Override
    public Suscripcion listId(int suscriptionId) {
        return sR.findById(suscriptionId).orElse(new Suscripcion());
    }

}
