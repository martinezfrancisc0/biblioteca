package com.example.biblioteca.service;

import com.example.biblioteca.model.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria save(Categoria categoria);
    Categoria update(Categoria categoria);
    void delete(Long id);
    Categoria getById(Long id);
    List<Categoria> findAll();
}
