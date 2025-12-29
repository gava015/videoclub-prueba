package com.ejercicio.videoclub.domain.entity;

public abstract class Pelicula {

    private String titulo;
    protected abstract int calcularPuntos(int dias);
}
