package pe.edu.upc.metrofast.servicesinterfaces;

import pe.edu.upc.metrofast.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {

    public void insertar(Suscripcion suscripcion);
    public void update(Suscripcion suscripcion);
    public void delete(int suscriptionId);
    public List<Suscripcion> list();
    public Suscripcion listId(int suscripcionId);




}
