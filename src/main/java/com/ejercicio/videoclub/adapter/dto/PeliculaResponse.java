package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.TipoPelicula;

import java.util.UUID;

public record PeliculaResponse(UUID peliculaId, String titulo, TipoPelicula tipoPelicula) {
}
