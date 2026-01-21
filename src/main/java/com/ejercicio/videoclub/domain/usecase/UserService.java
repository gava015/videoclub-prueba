package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.UserRequest;
import com.ejercicio.videoclub.adapter.gateway.UserUseCase;
import com.ejercicio.videoclub.domain.entity.User;

public class UserService implements UserUseCase {
    @Override
    public User createUser(UserRequest userRequest) {

        if (userRequest.name() == null || userRequest.name().isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }

        if(userRequest == null) {
            throw new IllegalArgumentException("User must not be null");
        }

        if(userRequest.userId() <= 0) {
            throw new IllegalArgumentException("User Id cannot negative");
        }

        User user = new User(userRequest.userId(),userRequest.name());


        // TODO: como ya creo el singleton, falta almacenar la información en el listado del singleton
        return user;
    }
}
