package pe.edu.upc.metrofast.servicesimplements;

import pe.edu.upc.metrofast.entities.ViajeProgramado;
import pe.edu.upc.metrofast.repositories.IViajeProgramadoRepository;
import pe.edu.upc.metrofast.servicesinterfaces.IViajeProgramadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeProgramadoServiceImplement implements IViajeProgramadoService {
    @Autowired
    private IViajeProgramadoRepository vR;


    @Override
    public void insert(ViajeProgramado viajeprogramado) { vR.save(viajeprogramado); }


    @Override
    public List<ViajeProgramado> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int tripid) {
        vR.deleteById(tripid);

    }

    @Override
    public void update(ViajeProgramado viajeprogramado) {
        vR.save(viajeprogramado);

    }
}
