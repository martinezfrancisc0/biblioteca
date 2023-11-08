package com.example.biblioteca.service;

import com.example.biblioteca.model.Libro;

import java.util.List;

public interface LibroService {

    Libro findByAutor(String autor);
    Libro findByTitulo(String titulo);
    List<Libro> findAll();
    Libro save(Libro libro);
    void deleteLibro(Long id);
}
