package com.cleteci.demo.services;


import com.cleteci.demo.dtos.LibroDto;
import com.cleteci.demo.entities.Libro;
import com.cleteci.demo.repositories.LibroRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class LibroService {

    @Autowired
    private final LibroRepository libroRepository;
    private final ModelMapper modelMapper;

    public ResponseEntity<Object> leerTodosLosLibros(){
        return new ResponseEntity<>(libroRepository.findAll().stream().map(this::mapFromEntitie).collect(Collectors.toList()), HttpStatus.OK);
    }

    public ResponseEntity<Object> leerUnLibro(long id){
        return new ResponseEntity<>(libroRepository.findById(id), HttpStatus.OK);
    }

    public ResponseEntity<Object> crearLibro(LibroDto libroDto){
        return new ResponseEntity<>(libroRepository.save(mapFromDto(libroDto)), HttpStatus.OK);
    }

    public ResponseEntity<Object> actualizarUnLibro(Long id, LibroDto libroDto){
        Libro libro = libroRepository.findById(id).orElse(null);
        if(libro == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        libro.setAutor(libroDto.getAutor());
        libro.setEditorial(libroDto.getEditorial());
        libro.setIsbn(libroDto.getIsbn());
        libro.setPaginas(libroDto.getPaginas());
        libro.setTitulo(libroDto.getTitulo());

        return new ResponseEntity<>(libroRepository.save(libro), HttpStatus.OK);
    }

    public ResponseEntity<Object> eliminarUnLibro(Long id){
        if(libroRepository.existsById(id)){
            libroRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    private LibroDto mapFromEntitie(Libro libro){
        return modelMapper.map(libro, LibroDto.class);
    }
    private Libro mapFromDto(LibroDto libroDto){ return modelMapper.map(libroDto, Libro.class); }
}
