package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.PeliculaRequest;
import com.ejercicio.videoclub.adapter.dto.PeliculaResponse;
import com.ejercicio.videoclub.adapter.gateway.PeliculaUseCase;

public class PeliculaController {

    private PeliculaUseCase peliculaUseCase;

    public PeliculaController(PeliculaUseCase peliculaUseCase) {
        this.peliculaUseCase = peliculaUseCase;
    }

    public PeliculaResponse crearPelicula(PeliculaRequest peliculaRequest) {
        peliculaUseCase.crearPelicula(peliculaRequest);

        // TODO: Ojo, aquí deberiamos tener un try/catch

        return new PeliculaResponse();
    }
}
