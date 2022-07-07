package com.cleteci.demo.repositories;

import com.cleteci.demo.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
