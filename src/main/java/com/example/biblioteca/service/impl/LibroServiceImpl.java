package com.example.biblioteca.service.impl;

import com.example.biblioteca.model.Categoria;
import com.example.biblioteca.model.Libro;
import com.example.biblioteca.repository.CategoriaRepository;
import com.example.biblioteca.repository.LibroRepository;
import com.example.biblioteca.service.CategoriaService;
import com.example.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepository libroRepository;

    CategoriaRepository categoriaRepository;

    @Override
    public Libro findByAutor(String autor){
        return libroRepository.findByAutor(autor);
    }

    @Override
    public Libro findByTitulo(String titulo) {
        return libroRepository.findByTitulo(titulo);
    }

    @Override
    public List<Libro> findAll(){return libroRepository.findAll();}
    @Override
    public Libro save(Libro libro) {

        return libroRepository.save(libro);
    }
    @Override
    public void deleteLibro(Long id){
        Libro libro = new Libro();
        libro.setId(id);
        libroRepository.delete(libro);}
}
