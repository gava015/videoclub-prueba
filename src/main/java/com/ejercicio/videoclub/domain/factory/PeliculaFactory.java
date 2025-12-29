package com.ejercicio.videoclub.domain.factory;

import com.ejercicio.videoclub.domain.entity.Pelicula;

public abstract class PeliculaFactory {
   public abstract Pelicula crearPelicula(String titulo);
}
