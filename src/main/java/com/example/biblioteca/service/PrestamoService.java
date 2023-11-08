package com.example.biblioteca.service;

import com.example.biblioteca.model.Prestamo;

import java.util.List;

public interface PrestamoService {
    Prestamo save(Prestamo prestamo);
    Prestamo getById(Long id);
    List<Prestamo> findAll();
}
