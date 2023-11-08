package com.example.biblioteca.service;



import com.example.biblioteca.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    Usuario update(Usuario usuario);
    void delete(Long id);
    Usuario getById(Long id);
    List<Usuario> findAll();
}
