package com.cleteci.demo.repositories;

import com.cleteci.demo.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findLibroByTitulo(String titulo);
    long deleteLibroByTitulo(String titulo);
}
