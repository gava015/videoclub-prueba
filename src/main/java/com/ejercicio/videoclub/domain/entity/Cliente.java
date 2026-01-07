package com.ejercicio.videoclub.domain.entity;

public class Cliente {
    private String nombre;
    private int clienteId;
    private int puntosFidelizacion;

    public Cliente(String nombre,int clienteId) {
        this.nombre = nombre;
        this.clienteId = clienteId;
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
}
