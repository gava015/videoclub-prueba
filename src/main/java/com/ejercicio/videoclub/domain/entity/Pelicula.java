package com.ejercicio.videoclub.domain.entity;

public abstract class Pelicula {
    private String titulo;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public abstract int calcularPuntosFidelizacion(int dias);

    public String getTitulo() {
        return titulo;
    }
}
