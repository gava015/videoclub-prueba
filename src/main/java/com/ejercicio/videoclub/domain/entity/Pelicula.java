package com.ejercicio.videoclub.domain.entity;

import java.util.UUID;

public class Pelicula {
    private UUID peliculaId;
    private String titulo;
    private TipoPelicula tipoPelicula;

    public Pelicula(UUID peliculaId, String titulo, TipoPelicula tipoPelicula) {
        this.peliculaId = peliculaId;
        this.titulo = titulo;
        this.tipoPelicula = tipoPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public TipoPelicula getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipoPelicula(TipoPelicula tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    public UUID getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(UUID peliculaId) {
        this.peliculaId = peliculaId;
    }
}
