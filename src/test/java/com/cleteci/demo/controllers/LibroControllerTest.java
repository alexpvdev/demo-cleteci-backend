package com.cleteci.demo.controllers;

import com.cleteci.demo.dtos.LibroDto;
import com.cleteci.demo.entities.Libro;
import com.cleteci.demo.repositories.LibroRepository;
import com.cleteci.demo.services.LibroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LibroControllerTest {

    @Autowired
    Libro libro;

    @Autowired
    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    LibroRepository libroRepositoryMock = Mockito.mock(LibroRepository.class);

    @Autowired
    LibroService libroService = new LibroService(libroRepositoryMock, modelMapper);

    @Autowired
    LibroController libroController = new LibroController(libroService);
    @BeforeEach
    void setUp() {

        Libro libro1 = new Libro(Long.valueOf("1"),"12345","MockitoTest","MockitoAutor",27,"EditorialMockito");
        Libro libro2 = new Libro(Long.valueOf("2"),"12345","MockitoTest","MockitoAutor",27,"EditorialMockito");
        List<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);

        Mockito.when(libroRepositoryMock.findAll()).thenReturn(libros);
        Mockito.when(libroRepositoryMock.findById(Long.valueOf("1"))).thenReturn(Optional.of(libro1));
        Mockito.when(libroRepositoryMock.save(libro1)).thenReturn(libro1);
    }

    @Test
    void leerTodosLosLibros() {
        ResponseEntity<Object> response = libroController.leerTodosLosLibros();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        List<LibroDto> responseBody = (ArrayList) response.getBody();
        assertEquals(responseBody.size(), 2);
    }

    @Test
    void leerUnLibro() {
        ResponseEntity<Object> response = libroController.leerUnLibro(Long.valueOf("1"));
        Optional<Libro> responseBody = (Optional<Libro>) response.getBody();
        String titulo = responseBody.get().getTitulo();
        assertEquals(titulo,"MockitoTest");
    }

    @Test
    void crearUnLibro() {
        LibroDto libro1 = new LibroDto(Long.valueOf("1"),"12345","MockitoTest","MockitoAutor",27,"EditorialMockito");
        ResponseEntity<Object> response = libroController.crearUnLibro(libro1);
        Libro responseBody = (Libro) response.getBody();
        assertEquals(responseBody.getTitulo(),"MockitoTest");
    }

    @Test
    void actualizarUnLibro() {
        LibroDto libro1 = new LibroDto(Long.valueOf("1"),"12345","MockitoTest","MockitoAutor",27,"EditorialMockito");
        ResponseEntity<Object> response = libroController.actualizarUnLibro(Long.valueOf(1),libro1);
        Libro responseBody = (Libro) response.getBody();
        assertEquals(responseBody.getTitulo(),"MockitoTest");
        assertEquals(responseBody.getId(),Long.valueOf("1"));
    }
}