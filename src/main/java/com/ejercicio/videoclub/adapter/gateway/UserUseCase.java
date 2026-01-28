package com.ejercicio.videoclub.adapter.gateway;

import com.ejercicio.videoclub.adapter.dto.UserRequest;
import com.ejercicio.videoclub.domain.entity.User;

public interface UserUseCase {
    User createUser(UserRequest userRequest);
}
