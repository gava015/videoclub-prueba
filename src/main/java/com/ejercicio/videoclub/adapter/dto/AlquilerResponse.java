package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.Cliente;
import java.util.List;

public record AlquilerResponse(Cliente cliente, List listaPeliculas, int alquilerDias) {
}
