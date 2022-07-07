package com.cleteci.demo.repositories;

import com.cleteci.demo.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findLibroByTitulo(String titulo);
    long deleteLibroByTitulo(String titulo);
}
