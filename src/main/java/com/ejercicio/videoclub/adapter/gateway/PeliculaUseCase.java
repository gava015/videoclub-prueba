package com.ejercicio.videoclub.adapter.gateway;

import com.ejercicio.videoclub.adapter.dto.PeliculaRequest;
import com.ejercicio.videoclub.domain.entity.Pelicula;

public interface PeliculaUseCase {

    Pelicula crearPelicula(PeliculaRequest peliculaRequest);
}
