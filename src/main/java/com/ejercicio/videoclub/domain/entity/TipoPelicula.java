package com.ejercicio.videoclub.domain.entity;

import java.util.function.Predicate;

public enum TipoPelicula {
    NUEVA(2),
    NORMAL(1),
    VIEJA(1);

    private final int puntosFidelizacion;

    TipoPelicula(int puntosFidelizacion) {
        this.puntosFidelizacion = puntosFidelizacion;
    }

    public int getPuntosFidelizacion() {
        return puntosFidelizacion;
    }
}
