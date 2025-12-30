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
}
