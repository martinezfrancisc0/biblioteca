package com.example.biblioteca.controller;

import com.example.biblioteca.model.Categoria;
import com.example.biblioteca.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> listarCategorias() { return categoriaService.findAll();}

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Long id){ return categoriaService.getById(id);}

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id){ categoriaService.delete(id);}

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria){ return categoriaService.save(categoria);}

    @PatchMapping
    public Categoria actualizarCategoria(@RequestBody Categoria categoria){ return categoriaService.update(categoria);}
}
