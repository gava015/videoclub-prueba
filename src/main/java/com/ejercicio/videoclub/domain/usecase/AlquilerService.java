package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.AlquilerRequest;
import com.ejercicio.videoclub.adapter.gateway.AlquilerUseCase;
import com.ejercicio.videoclub.domain.entity.Alquiler;

public class AlquilerService implements AlquilerUseCase {
    @Override
    public Alquiler crearAlquiler(AlquilerRequest alquilerRequest) {

        if (alquilerRequest.cliente() == null) {
            throw new IllegalArgumentException("Debe agregar un cliente");
        }

        if(alquilerRequest.listaPeliculas().isEmpty() || alquilerRequest.listaPeliculas() == null){
            throw new IllegalArgumentException("La lista de peliculas no puede estar vacía");
        }

        if(alquilerRequest.alquilerDias() < 1){
            throw new IllegalArgumentException("El número de días no debe ser menor a uno");
        }

        Alquiler alquiler = new Alquiler(alquilerRequest.cliente(),alquilerRequest.listaPeliculas(),alquilerRequest.alquilerDias());
        return alquiler;
    }
}
