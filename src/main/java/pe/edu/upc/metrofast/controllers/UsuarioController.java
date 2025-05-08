package pe.edu.upc.metrofast.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.metrofast.dtos.UsuarioDTO;
import pe.edu.upc.metrofast.entities.Usuario;
import pe.edu.upc.metrofast.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uR;

    @PostMapping("/registrar")
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(dto, Usuario.class);
        uR.insert(a);
    }

    @GetMapping("/listas")
    public List<UsuarioDTO> listar() {
        return uR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario s = m.map(dto, Usuario.class);
        uR.update(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uR.delete(id);
    }
}
