package com.example.biblioteca.service.impl;

import com.example.biblioteca.model.Categoria;
import com.example.biblioteca.repository.CategoriaRepository;
import com.example.biblioteca.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria save(Categoria categoria){ return categoriaRepository.save(categoria);}

    @Override
    public Categoria update(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Long id) {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(id);
        categoriaRepository.delete(categoria);
    }

    @Override
    public Categoria getById(Long id) {
        return categoriaRepository.findById(id).orElse(new Categoria());
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

}
