package com.ejercicio.videoclub.domain.factory;

import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.entity.PeliculaVieja;

public class PeliculaViejaFactory extends PeliculaFactory{
    @Override
    public Pelicula crearPelicula(String titulo) {
        return new PeliculaVieja(titulo);
    }
}
