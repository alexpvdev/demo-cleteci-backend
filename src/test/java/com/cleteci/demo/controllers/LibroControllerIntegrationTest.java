package com.cleteci.demo.controllers;


import com.cleteci.demo.entities.Libro;
import com.cleteci.demo.repositories.LibroRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class LibroControllerIntegrationTest {

    @Autowired
    private LibroRepository libroRepository;

    @Test
    void validarCreacionDeLibros(){
        Libro libro = crearLibro();
        List<Libro> resultOne = libroRepository.findLibroByTitulo("Elizabeth Keen y los 7 enanitos");
        libroRepository.save(libro);
        List<Libro> resultTwo = libroRepository.findLibroByTitulo("Elizabeth Keen y los 7 enanitos");

        assert resultOne.size() == resultTwo.size()-1;
    }

    @Test
    void validarEliminaciónDeLibros(){
        Libro libro = crearLibro();
        libroRepository.save(libro);

        List<Libro> resultOne = libroRepository.findLibroByTitulo("Elizabeth Keen y los 7 enanitos");
        assert resultOne.size() > 0;

        libroRepository.deleteLibroByTitulo("Elizabeth Keen y los 7 enanitos");

        List<Libro> resultTwo = libroRepository.findLibroByTitulo("Elizabeth Keen y los 7 enanitos");

        assert resultTwo.size() == 0;
    }

    @Test
    void validarActualizaciónDeLibros(){
        Libro libro = crearLibro();
        libro = libroRepository.save(libro);
        libro.setPaginas(999);
        libro = libroRepository.save(libro);

        assert libro.getPaginas() == 999;
    }

    @Test
    void validarObtenciónDeLibroPorId(){

        Libro libro = crearLibro();
        libro = libroRepository.save(libro);

        Libro result = libroRepository.findById(libro.getId()).orElse(null);

        assert result != null;
    }

    private Libro crearLibro() {
        Libro libro = new Libro();
        libro.setIsbn("1119635");
        libro.setTitulo("Elizabeth Keen y los 7 enanitos");
        libro.setPaginas(34);
        libro.setAutor("Elizabeth Keen");
        libro.setEditorial("Notitarde");
        return libro;
    }
}
