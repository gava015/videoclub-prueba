package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.ClienteRequest;
import com.ejercicio.videoclub.adapter.dto.ClienteResponse;
import com.ejercicio.videoclub.adapter.gateway.ClienteUseCase;
import com.ejercicio.videoclub.domain.entity.Cliente;

public class ClienteController {

    private ClienteUseCase clienteUseCase;

    public ClienteController(ClienteUseCase clienteUseCase) {
        this.clienteUseCase = clienteUseCase;
    }

    public ClienteResponse crearCliente(ClienteRequest clienteRequest) {

        Cliente cliente = clienteUseCase.crearCliente(clienteRequest);
        ClienteResponse clienteResponse = new ClienteResponse(cliente.getClienteId(), cliente.getNombre());

        return clienteResponse;
    }
}
