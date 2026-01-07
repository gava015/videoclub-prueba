package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.PeliculaRequest;
import com.ejercicio.videoclub.adapter.gateway.PeliculaUseCase;
import com.ejercicio.videoclub.domain.entity.Pelicula;

public class PeliculaService implements PeliculaUseCase {
    @Override
    public Pelicula crearPelicula(PeliculaRequest peliculaRequest) {

        if (peliculaRequest.titulo() == null || peliculaRequest.titulo().isBlank()){
            throw new IllegalArgumentException("El titulo no puedee estar vacío");
        }

        if(peliculaRequest.tipoPelicula() == null){
            throw new IllegalArgumentException("Debe seleccionar un tipo de pelicula");
        }

        Pelicula pelicula = new Pelicula(peliculaRequest.titulo(),peliculaRequest.tipoPelicula(), peliculaRequest.peliculaId());

        return pelicula;
    }
}


