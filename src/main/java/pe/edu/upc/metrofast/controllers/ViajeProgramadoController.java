package pe.edu.upc.metrofast.controllers;

import pe.edu.upc.metrofast.dtos.CantidadDTO;
import pe.edu.upc.metrofast.dtos.ViajeProgramadoDTO;
import pe.edu.upc.metrofast.entities.ViajeProgramado;
import pe.edu.upc.metrofast.servicesinterfaces.IViajeProgramadoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viajesprogramados")
public class ViajeProgramadoController {
    @Autowired
    private IViajeProgramadoService vS;

    @PostMapping("/registrar")
    public void registrar(@RequestBody ViajeProgramadoDTO dto) {
        ModelMapper m = new ModelMapper();
        ViajeProgramado a = m.map(dto, ViajeProgramado.class);
        vS.insert(a);
    }

    @GetMapping("/listas")
    public List<ViajeProgramadoDTO> listar() {
        return vS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ViajeProgramadoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody ViajeProgramadoDTO dto) {
        ModelMapper m = new ModelMapper();
        ViajeProgramado s = m.map(dto, ViajeProgramado.class);
        vS.update(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        vS.delete(id);
    }

    @GetMapping("/buscar")
    public List<ViajeProgramadoDTO> buscarFecha(@RequestParam LocalDate fecha) {
        return vS.listporViajeprogramdo(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ViajeProgramadoDTO.class);
        }).collect(Collectors.toList());
    }



}
