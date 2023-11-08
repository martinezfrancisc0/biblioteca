package com.example.biblioteca.controller;

import com.example.biblioteca.model.Devolucion;
import com.example.biblioteca.service.DevolucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devoluciones")
public class DevolucionController {
    @Autowired
    DevolucionService devolucionService;
    @GetMapping("/")
    public List<Devolucion> listarDevoluciones(){return devolucionService.findAll();}
    @PostMapping
    public Devolucion crearDevolucion(@RequestBody Devolucion devolucion){ return devolucionService.save(devolucion);}
    @DeleteMapping("/{id}")
    public void eliminarDevolucion(@PathVariable Long id){
        Devolucion devolucion = new Devolucion();
        devolucion.setId(id);
        devolucionService.deleteDevolucion(devolucion);
    }


}
