package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.ClienteRequest;
import com.ejercicio.videoclub.adapter.gateway.ClienteUseCase;
import com.ejercicio.videoclub.domain.entity.Cliente;

public class ClienteService implements ClienteUseCase {
    @Override
    public Cliente crearCliente(ClienteRequest clienteRequest) {

        if (clienteRequest.nombre() == null || clienteRequest.nombre().isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        if(clienteRequest == null) {
            throw new IllegalArgumentException("El cliente no debe ser null");
        }

        if(clienteRequest.clienteId() <= 0) {
            throw new IllegalArgumentException("El clienteId debe ser mayor o igual a cero");
        }

        Cliente cliente = new Cliente(clienteRequest.nombre(),clienteRequest.clienteId());

        // TODO: como ya creo el singleton, falta almacenar la información en el listado del singleton
        return cliente;
    }
}
