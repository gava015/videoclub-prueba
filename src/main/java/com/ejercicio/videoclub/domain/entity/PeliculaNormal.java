package com.ejercicio.videoclub.domain.entity;

public class PeliculaNormal extends Pelicula {
    static final int PUNTOS_FIDELIZACION = 1;
    public PeliculaNormal(String titulo) {
        super(titulo);
    }

    @Override
    public int calcularPuntosFidelizacion(int dias) {
        return PUNTOS_FIDELIZACION * dias;
    }
}
