package com.ejercicio.videoclub.domain.entity;

public class PeliculaVieja extends Pelicula {

    static final int PUNTOS_FIDELIZACION = 1;
    public PeliculaVieja(String titulo) {
        super(titulo);
    }

    @Override
    public int calcularPuntosFidelizacion(int dias) {
        return PUNTOS_FIDELIZACION * dias;
    }
}
