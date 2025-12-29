package com.ejercicio.videoclub.domain.factory;

import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.entity.PeliculaNueva;

public class PeliculaNuevaFactory extends PeliculaFactory {
    @Override
    public Pelicula crearPelicula(String titulo) {
        return new PeliculaNueva(titulo);
    }
}
