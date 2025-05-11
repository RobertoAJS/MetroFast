package pe.edu.upc.metrofast.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.metrofast.dtos.HistorialDeViajesDTO;
import pe.edu.upc.metrofast.dtos.SuscripcionDTO;
import pe.edu.upc.metrofast.dtos.UsuarioDTO;
import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import pe.edu.upc.metrofast.entities.Suscripcion;
import pe.edu.upc.metrofast.entities.Usuario;
import pe.edu.upc.metrofast.servicesinterfaces.ISuscripcionService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SuscripcionController {

    @Autowired
    private ISuscripcionService sS;


    @PostMapping("/registra")
    public void insertar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion s = m.map(dto, Suscripcion.class);
        sS.insertar(s);

    }
    @PutMapping("/modificar")
    public void modificar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion s = m.map(dto, Suscripcion.class);
        sS.update(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        sS.delete(id);
    }

    @GetMapping("/listas")
    public List<SuscripcionDTO> listar(){
        return sS.list().stream().map(z->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(z, SuscripcionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SuscripcionDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        SuscripcionDTO dto=m.map(sS.listId(id), SuscripcionDTO.class);
        return dto;
    }


}
