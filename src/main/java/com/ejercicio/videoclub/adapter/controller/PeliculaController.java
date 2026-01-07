package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.PeliculaRequest;
import com.ejercicio.videoclub.adapter.dto.PeliculaResponse;
import com.ejercicio.videoclub.adapter.gateway.PeliculaUseCase;
import com.ejercicio.videoclub.domain.entity.Pelicula;

public class PeliculaController {

    private PeliculaUseCase peliculaUseCase;

    public PeliculaController(PeliculaUseCase peliculaUseCase) {
        this.peliculaUseCase = peliculaUseCase;
    }

    public PeliculaResponse crearPelicula(PeliculaRequest peliculaRequest) {

        Pelicula pelicula = peliculaUseCase.crearPelicula(peliculaRequest);
        PeliculaResponse peliculaResponse = new PeliculaResponse(pelicula.getPeliculaId(),pelicula.getTitulo(), pelicula.getTipoPelicula());

        return peliculaResponse;
    }
}
