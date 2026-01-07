package com.ejercicio.videoclub.domain.entity;

public class Pelicula {
    private int peliculaId;
    private String titulo;
    private TipoPelicula tipoPelicula;

    public Pelicula(String titulo, TipoPelicula tipoPelicula, int peliculaId) {
        this.titulo = titulo;
        this.peliculaId = peliculaId;
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

    public int getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(int peliculaId) {
        this.peliculaId = peliculaId;
    }
}
