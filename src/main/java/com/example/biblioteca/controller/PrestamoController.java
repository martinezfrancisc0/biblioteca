package com.example.biblioteca.controller;

import com.example.biblioteca.model.Prestamo;
import com.example.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {
    @Autowired
    PrestamoService prestamoService;

    @GetMapping("/")
    public List<Prestamo> listarPrestamos(){ return prestamoService.findAll();}
    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo){ return prestamoService.save(prestamo);}
    @GetMapping("/{id}")
    public Prestamo getById(@PathVariable Long id){ return prestamoService.getById(id);}
}
