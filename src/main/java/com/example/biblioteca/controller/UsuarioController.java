package com.example.biblioteca.controller;

import com.example.biblioteca.model.Usuario;
import com.example.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping("/")
    public List<Usuario> listarUsuarios(){return usuarioService.findAll();}

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Long id){ return usuarioService.getById(id);}

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id){ usuarioService.delete(id);}

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){ return usuarioService.save(usuario);}

    @PatchMapping
    public Usuario actualizarUsuario(@RequestBody Usuario usuario){ return usuarioService.update(usuario);}
}
