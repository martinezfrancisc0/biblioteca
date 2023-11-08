package com.example.biblioteca.controller;

import com.example.biblioteca.model.Multas;
import com.example.biblioteca.service.MultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/multas")
public class MultasController {
    @Autowired
    private MultasService multasService;
    @GetMapping("/")
    public List<Multas> listarMultas(){ return multasService.findAll();}
    @PostMapping
    public Multas crearMultas(@RequestBody Multas multas){ return multasService.save(multas);}
    @DeleteMapping("/{id}")
    public void eliminarMultas(@PathVariable Long id){
        Multas multas = new Multas();
        multas.setId(id);
        multasService.delete(multas);
    }

}
