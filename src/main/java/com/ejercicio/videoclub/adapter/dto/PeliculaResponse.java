package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.TipoPelicula;

public record PeliculaResponse(String titulo, TipoPelicula tipoPelicula) {
    // TODO: Analice cuales son los datos que debería contener la respuesta
}
