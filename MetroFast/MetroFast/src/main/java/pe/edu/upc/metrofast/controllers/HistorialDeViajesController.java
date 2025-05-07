package pe.edu.upc.metrofast.controllers;
import org.modelmapper.ModelMapper;
import pe.edu.upc.metrofast.dtos.HistorialDeViajesDTO;
import pe.edu.upc.metrofast.entities.HistorialDeViajes;
import pe.edu.upc.metrofast.servicesinterfaces.IHistorialDeViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historiales")
public class HistorialDeViajesController {
    @Autowired
    private IHistorialDeViajeService hS;

    @PostMapping("/registrar")
    public void registrar(@RequestBody HistorialDeViajesDTO dto) {
        ModelMapper m = new ModelMapper();
        HistorialDeViajes a = m.map(dto, HistorialDeViajes.class);
        hS.insert(a);
    }

    @GetMapping("/listas")
    public List<HistorialDeViajesDTO> listar() {
        return hS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, HistorialDeViajesDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody HistorialDeViajesDTO dto) {
        ModelMapper m = new ModelMapper();
        HistorialDeViajes s = m.map(dto, HistorialDeViajes.class);
        hS.update(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        hS.delete(id);
    }


}
