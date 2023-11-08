package com.example.biblioteca.controller;

import com.example.biblioteca.model.Libro;
import com.example.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/{autor}")
    public Libro findLibroByAutor(@PathVariable String autor){return libroService.findByAutor(autor);}
    @GetMapping("/{titulo}")
    public Libro findLibroByTitulo(@PathVariable String titulo){return libroService.findByTitulo(titulo);}
    @GetMapping("/")
    public List<Libro> listarLibros(){ return libroService.findAll();}
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) { return libroService.save(libro);}
    @PutMapping
    public Libro actualizarLibro(@RequestBody Libro libro){ return libroService.save(libro);}
    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id){
        libroService.deleteLibro(id);
    }
}
