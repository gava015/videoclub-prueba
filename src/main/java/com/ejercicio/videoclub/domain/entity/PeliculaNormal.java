package com.ejercicio.videoclub.domain.entity;

public class PeliculaNormal extends Pelicula {
    @Override
    protected int calcularPuntos(int dias) {
        return 0;
    }
}
