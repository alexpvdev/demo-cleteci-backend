package com.cleteci.demo.dtos;

import lombok.Data;

@Data
public class LibroDto {

    Long id;
    String isbn;
    String titulo;
    String autor;
    int paginas;
    String editorial;
}
