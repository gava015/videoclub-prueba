package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.AlquilerRequest;
import com.ejercicio.videoclub.adapter.dto.AlquilerResponse;
import com.ejercicio.videoclub.adapter.gateway.AlquilerUseCase;

public class AlquilerController {
    private AlquilerUseCase alquilerUseCase;

    public AlquilerController(AlquilerUseCase alquilerUseCase) {
        this.alquilerUseCase = alquilerUseCase;
    }

    public AlquilerResponse crearAlquiler(AlquilerRequest alquilerRequest) {

        AlquilerResponse alquilerResponse =  alquilerUseCase.crearAlquiler(alquilerRequest);

        return alquilerResponse;
        }
    }

