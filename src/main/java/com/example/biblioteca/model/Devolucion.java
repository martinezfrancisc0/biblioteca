package com.example.biblioteca.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Devolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean tieneMulta;
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prestamo_id")
    private List<Prestamo> prestamos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isTieneMulta() {
        return tieneMulta;
    }

    public void setTieneMulta(boolean tieneMulta) {
        this.tieneMulta = tieneMulta;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
