package com.ejercicio.videoclub.domain.entity;

public class Cliente {
    private int clienteId;
    private String nombre;
    private int puntosFidelizacion;

    public Cliente(String nombre,int clienteId) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.puntosFidelizacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public void setPuntosFidelizacion(int puntosFidelizacion) {
        this.puntosFidelizacion = puntosFidelizacion;
    }

    public int getPuntosFidelizacion() {
        return puntosFidelizacion;
    }
}
