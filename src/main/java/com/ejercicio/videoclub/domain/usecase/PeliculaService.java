package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.PeliculaRequest;
import com.ejercicio.videoclub.adapter.gateway.PeliculaUseCase;
import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.repository.VideoClubData;

import java.util.UUID;

public class PeliculaService implements PeliculaUseCase {

    private final VideoClubData data = VideoClubData.getInstance();

    @Override
    public Pelicula crearPelicula(PeliculaRequest peliculaRequest) {

        if (peliculaRequest.titulo() == null || peliculaRequest.titulo().isBlank()) {
            throw new IllegalArgumentException("El titulo no puedee estar vacío");
        }

        if(peliculaRequest.tipoPelicula() == null) {
            throw new IllegalArgumentException("Debe seleccionar un tipo de pelicula");
        }

        UUID peliculaId = UUID.randomUUID();
        Pelicula pelicula = new Pelicula(peliculaId,peliculaRequest.titulo(),peliculaRequest.tipoPelicula());
        data.getPeliculas().add(pelicula);

        return pelicula;
    }

    // TODO: Crear el flujo para listar las peliculas (peliculas por tipo)
}


