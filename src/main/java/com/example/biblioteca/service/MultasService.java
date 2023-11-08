package com.example.biblioteca.service;

import com.example.biblioteca.model.Multas;

import java.util.List;

public interface MultasService {
    Multas save(Multas multas);
    List<Multas> findAll();
    void delete(Multas multas);
}
