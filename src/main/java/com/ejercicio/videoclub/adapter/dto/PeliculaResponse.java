package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.TipoPelicula;

public record PeliculaResponse( int peliculaId, String titulo, TipoPelicula tipoPelicula) {
}
