package com.ejercicio.videoclub.domain.entity;

public class Pelicula {
    private String titulo;
    private TipoPelicula tipoPelicula;


    public Pelicula(String titulo, TipoPelicula tipoPelicula) {
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
}
