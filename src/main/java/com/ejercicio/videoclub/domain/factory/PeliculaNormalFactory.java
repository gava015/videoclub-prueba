package com.ejercicio.videoclub.domain.factory;

import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.entity.PeliculaNormal;

public class PeliculaNormalFactory extends PeliculaFactory{
    @Override
    public Pelicula crearPelicula(String titulo) {
        return new PeliculaNormal(titulo);
    }
}
