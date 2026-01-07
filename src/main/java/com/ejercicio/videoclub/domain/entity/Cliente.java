package com.ejercicio.videoclub.domain.entity;

public class Cliente {
    private String nombre;
    private int puntosFidelizacion;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.puntosFidelizacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosFidelizacion(int puntosFidelizacion) {
        this.puntosFidelizacion = puntosFidelizacion;
    }
}
