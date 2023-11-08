package com.example.biblioteca.service.impl;

import com.example.biblioteca.model.Prestamo;
import com.example.biblioteca.repository.PrestamoRepository;
import com.example.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrestamoServiceImpl implements PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;
    @Override
    public Prestamo save(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo getById(Long id) {
        return prestamoRepository.findById(id).orElse(new Prestamo());
    }

    @Override
    public List<Prestamo> findAll() {
        return prestamoRepository.findAll();
    }
}
