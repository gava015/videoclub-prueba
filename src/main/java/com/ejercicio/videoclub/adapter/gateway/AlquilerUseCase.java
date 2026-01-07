package com.ejercicio.videoclub.adapter.gateway;

import com.ejercicio.videoclub.adapter.dto.AlquilerRequest;
import com.ejercicio.videoclub.domain.entity.Alquiler;

public interface AlquilerUseCase{
    Alquiler crearAlquiler(AlquilerRequest alquilerRequest);
}
