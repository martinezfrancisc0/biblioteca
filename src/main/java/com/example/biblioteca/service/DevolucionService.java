package com.example.biblioteca.service;

import com.example.biblioteca.model.Devolucion;


import java.util.List;

public interface DevolucionService {
    Devolucion save(Devolucion devolucion);
    List<Devolucion> findAll();
    void deleteDevolucion(Devolucion devolucion);
}
