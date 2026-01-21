package com.ejercicio.videoclub.domain.entity;

public enum MovieType {
    NEW(2),
    REGULAR(1),
    OLD(1);
    private final int loyaltyPoints;

    MovieType(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
