package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.UserRequest;
import com.ejercicio.videoclub.adapter.dto.UserResponse;
import com.ejercicio.videoclub.adapter.gateway.UserUseCase;
import com.ejercicio.videoclub.domain.entity.User;

public class UserController {
    private UserUseCase userUseCase;

    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    public UserResponse createUser(UserRequest userRequest) {

        User user = userUseCase.createUser(userRequest);
        UserResponse userResponse = new UserResponse(user.getUserId(), user.getName());

        return userResponse;
    }
}
