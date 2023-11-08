package com.example.biblioteca.service.impl;

import com.example.biblioteca.model.Categoria;
import com.example.biblioteca.model.Usuario;
import com.example.biblioteca.repository.UsuarioRepository;
import com.example.biblioteca.service.CategoriaService;
import com.example.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuarioRepository.delete(usuario);
    }

    @Override
    public Usuario getById(Long id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
