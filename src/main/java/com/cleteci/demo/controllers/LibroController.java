package com.cleteci.demo.controllers;


import com.cleteci.demo.constants.GeneralConstants;
import com.cleteci.demo.dtos.LibroDto;
import com.cleteci.demo.services.LibroService;
import lombok.AllArgsConstructor;
import org.jsondoc.core.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@Api(name = "Libros",
        description = "Apis para transacciones referentes a libros")
@ApiVersion(since = "1.0")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/libro")
@AllArgsConstructor
public class LibroController implements GeneralConstants {
    private final LibroService libroService;

    @GetMapping
    @ApiMethod(description = LEER_TODOS_LOS_LIBROS_DESCRIPCION)
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponseObject
    @ResponseBody
    public ResponseEntity<Object> leerTodosLosLibros(){
        return libroService.leerTodosLosLibros();
    }

    @ApiMethod(description = LEER_UN_LIBRO_DESCRIPCION)
    @RequestMapping(method = RequestMethod.GET,value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponseObject
    @ResponseBody
    public ResponseEntity<Object> leerUnLibro(@ApiPathParam() @PathVariable("id") Long id){
        return libroService.leerUnLibro(id);
    }

    @ApiMethod(description = CREAR_UN_LIBRO_DESCRIPCION)
    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponseObject
    @ResponseBody
    public ResponseEntity<Object> crearUnLibro(@ApiBodyObject(clazz = String.class) @RequestBody LibroDto libro){
        return libroService.crearLibro(libro);
    }

    @ApiMethod(description = EDITAR_UN_LIBRO_DESCRIPCION)
    @RequestMapping(method = RequestMethod.PUT,value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponseObject
    @ResponseBody
    public ResponseEntity<Object> actualizarUnLibro(@ApiPathParam() @PathVariable("id") Long id, @ApiBodyObject(clazz = String.class) @RequestBody LibroDto libro){
        return libroService.actualizarUnLibro(id,libro);
    }

    @ApiMethod(description = ELIMINAR_UN_LIBRO_DESCRIPCION)
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponseObject
    @ResponseBody
    public ResponseEntity<Object> eliminarUnLibro(@ApiPathParam() @PathVariable("id") Long id){
        return libroService.eliminarUnLibro(id);
    }
}
