package com.cleteci.demo.controllers;


import com.cleteci.demo.constants.GeneralConstants;
import com.cleteci.demo.dtos.LibroDto;
import com.cleteci.demo.services.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/libro")
@AllArgsConstructor
public class LibroController implements GeneralConstants {
    private final LibroService libroService;

    @GetMapping
    public ResponseEntity<Object> leerTodosLosLibros(){
        return libroService.leerTodosLosLibros();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> leerUnLibro(@PathVariable("id") Long id){
        return libroService.leerUnLibro(id);
    }

    @PostMapping
    public ResponseEntity<Object> crearUnLibro(@RequestBody LibroDto libro){
        return libroService.crearLibro(libro);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> actualizarUnLibro(@PathVariable("id") Long id, @RequestBody LibroDto libro){
        return libroService.actualizarUnLibro(id,libro);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> eliminarUnLibro(@PathVariable("id") Long id){
        return libroService.eliminarUnLibro(id);
    }
}
