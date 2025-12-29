package com.ejercicio.videoclub.domain.entity;

public class PeliculaNueva extends Pelicula {

    static final int PUNTOS_FIDELIZACION = 2;

    public PeliculaNueva(String titulo) {
        super(titulo);
    }

    @Override
    public int calcularPuntosFidelizacion(int dias) {
        return PUNTOS_FIDELIZACION * dias;
    }
}
