package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.AlquilerRequest;
import com.ejercicio.videoclub.adapter.dto.AlquilerResponse;
import com.ejercicio.videoclub.adapter.gateway.AlquilerUseCase;
import com.ejercicio.videoclub.domain.entity.Alquiler;

public class AlquilerController {
    private AlquilerUseCase alquilerUseCase;
    public AlquilerController(AlquilerUseCase alquilerUseCase) {
        this.alquilerUseCase = alquilerUseCase;
    }

    public AlquilerResponse crearAlquiler(AlquilerRequest alquilerRequest) {

        Alquiler alquiler =  alquilerUseCase.crearAlquiler(alquilerRequest);
        AlquilerResponse alquilerResponse = new AlquilerResponse(alquiler.getCliente(),alquiler.getListaPeliculas(),alquiler.getAlquilerDias());

        return alquilerResponse;
        }
    }

