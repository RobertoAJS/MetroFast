package pe.edu.upc.metrofast.servicesinterfaces;

import pe.edu.upc.metrofast.entities.ViajeProgramado;

import java.util.List;

public interface IViajeProgramadoService {
    public void insert(ViajeProgramado viajeprogramado);
    public List<ViajeProgramado> list();
    public void delete(int tripid);
    public void update(ViajeProgramado viajeprogramado);
}
