package com.example.biblioteca.service.impl;


import com.example.biblioteca.model.Multas;
import com.example.biblioteca.repository.MultasRepository;
import com.example.biblioteca.service.MultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MultasServiceImpl implements MultasService {
    /**
     * Metodo para calcular el monto de las multas
     */
    @Autowired
    private MultasRepository multasRepository;
    @Override
    public Multas save(Multas multas) {
        LocalDate localDate = LocalDate.now();
        int cantidad = 0;
        List<Long> dias = multas.getDevolucion().getPrestamos().stream().map(prestamo -> diferenciaFechas(prestamo.getFechaVencimiento(),localDate)).collect(Collectors.toList());
        multas.setMonto(Math.toIntExact(dias.stream().reduce(0L, (a, b) -> a * 2 + b * 2)));
        return multasRepository.save(multas);
    }

    @Override
    public List<Multas> findAll() {
        return multasRepository.findAll();
    }

    @Override
    public void delete(Multas multas) {
        multasRepository.delete(multas);
    }

    public static long diferenciaFechas(LocalDate fecha1, LocalDate fecha2){
        long diferencia = ChronoUnit.DAYS.between(fecha1, fecha2);
        return diferencia;
    }
}
