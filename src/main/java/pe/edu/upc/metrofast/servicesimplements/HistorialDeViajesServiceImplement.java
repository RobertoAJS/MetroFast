package pe.edu.upc.metrofast.servicesimplements;

import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import pe.edu.upc.metrofast.repositories.IHistorialDeViajesRepository;
import pe.edu.upc.metrofast.servicesinterfaces.IHistorialDeViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialDeViajesServiceImplement implements IHistorialDeViajeService {
    @Autowired
    private IHistorialDeViajesRepository hR;


    @Override
    public void insert(HistorialDeViajes historialdeviajes) {hR.save(historialdeviajes);}


    @Override
    public List<HistorialDeViajes> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int historyid) {
        hR.deleteById(historyid);

    }

    @Override
    public void update(HistorialDeViajes historialdeviajes) {
        hR.save(historialdeviajes);

    }

    @Override
    public List<String[]> cantidadbyUsername() {
        return hR.quantitybyUsername();
    }


}
