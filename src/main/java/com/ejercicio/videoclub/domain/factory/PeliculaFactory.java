package com.ejercicio.videoclub.domain.factory;

import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.entity.TipoPelicula;

public class PeliculaFactory {

    public static Pelicula crearPelicula(String titulo, TipoPelicula tipoPelicula){
        return new Pelicula(titulo,tipoPelicula);
    }
}
