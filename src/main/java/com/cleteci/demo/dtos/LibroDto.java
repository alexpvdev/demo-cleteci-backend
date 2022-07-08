package com.cleteci.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDto {

    Long id;
    String isbn;
    String titulo;
    String autor;
    int paginas;
    String editorial;
}
