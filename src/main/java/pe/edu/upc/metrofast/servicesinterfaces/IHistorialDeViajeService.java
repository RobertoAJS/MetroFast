package pe.edu.upc.metrofast.servicesinterfaces;

import pe.edu.upc.metrofast.entities.HistorialDeViajes;

import java.util.List;

public interface IHistorialDeViajeService {
    public void insert(HistorialDeViajes historialdeviajes);
    public List<HistorialDeViajes> list();
    public void delete(int historyid);
    public void update(HistorialDeViajes historialdeviajes);
    public List<String[]> cantidadbyUsername();


}
