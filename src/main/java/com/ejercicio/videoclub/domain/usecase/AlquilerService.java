package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.AlquilerRequest;
import com.ejercicio.videoclub.adapter.dto.AlquilerResponse;
import com.ejercicio.videoclub.adapter.gateway.AlquilerUseCase;
import com.ejercicio.videoclub.domain.entity.Alquiler;

public class AlquilerService implements AlquilerUseCase {
    @Override
    public AlquilerResponse crearAlquiler(AlquilerRequest alquilerRequest) {

        if (alquilerRequest.cliente() == null) {
            throw new IllegalArgumentException("Debe agregar un cliente");
        }

        if(alquilerRequest.listaPeliculas().isEmpty() || alquilerRequest.listaPeliculas() == null){
            throw new IllegalArgumentException("La lista de peliculas no puede estar vacía");
        }

        if(alquilerRequest.alquilerDias() < 1){
            throw new IllegalArgumentException("El número de días no debe ser menor a uno");
        }

        Alquiler alquiler = new Alquiler(alquilerRequest.cliente(), alquilerRequest.listaPeliculas(), alquilerRequest.alquilerDias());

        AlquilerResponse alquilerResponse = new AlquilerResponse(
                alquiler.getCliente(),
                alquiler.getListaPeliculas(),
                alquiler.getAlquilerDias(),
                alquiler.calcularPrecioAlquiler());
        alquiler.asignarPuntosFidelizacion();

        //TODO: Falta almacenar la información en el listado de la clase singleton

        return alquilerResponse;
    }
}
