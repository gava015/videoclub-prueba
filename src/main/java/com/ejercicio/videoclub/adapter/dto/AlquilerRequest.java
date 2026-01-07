package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.Cliente;
import java.util.List;

public record AlquilerRequest(Cliente cliente, List listaPeliculas, int alquilerDias) {
}
