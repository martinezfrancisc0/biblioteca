package com.example.biblioteca.service.impl;

import com.example.biblioteca.model.Devolucion;
import com.example.biblioteca.model.Prestamo;
import com.example.biblioteca.repository.DevolucionRepository;
import com.example.biblioteca.service.DevolucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DevolucionServiceImpl implements DevolucionService {
    /**
     * Metodo para guardar la devolucion compara las fechas para comprobar si hay multa
     */
    @Autowired
    DevolucionRepository devolucionRepository;
    @Override
    public Devolucion save(Devolucion devolucion) {
        LocalDate localDate = LocalDate.now();
        List<Prestamo> prestamos = devolucion.getPrestamos().stream().filter(prestamo -> prestamo.getFechaVencimiento().isBefore(localDate))
                .collect(Collectors.toList());
        devolucion.setTieneMulta(prestamos.size()>0);
        return devolucionRepository.save(devolucion);
    }

    @Override
    public List<Devolucion> findAll() {
        return devolucionRepository.findAll();
    }

    @Override
    public void deleteDevolucion(Devolucion devolucion) {
       devolucionRepository.delete(devolucion);
    }
}
