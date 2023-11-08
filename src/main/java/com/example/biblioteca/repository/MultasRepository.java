package com.example.biblioteca.repository;

import com.example.biblioteca.model.Multas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultasRepository extends JpaRepository<Multas,Long> {

}
