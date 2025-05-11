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
    private IUsuarioService uS;

    @PostMapping("/registra")
    public void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insertar(u);

    }
    @GetMapping("/listas")
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(z->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(z, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id), UsuarioDTO.class);
        return dto;
    }

}
