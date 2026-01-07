package com.ejercicio.videoclub.adapter.gateway;

import com.ejercicio.videoclub.adapter.dto.ClienteRequest;
import com.ejercicio.videoclub.domain.entity.Cliente;

public interface ClienteUseCase {

    Cliente crearCliente(ClienteRequest clienteRequest);
}
