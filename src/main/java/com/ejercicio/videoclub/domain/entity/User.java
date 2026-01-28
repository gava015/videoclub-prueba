package com.ejercicio.videoclub.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int userId;
    private String name;
    private int loyaltyPoints = 0;

    public User(int userId, String name) {
        this.name = name;
        this.loyaltyPoints = 0;
    }
}
