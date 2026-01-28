package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.RentalRequest;
import com.ejercicio.videoclub.adapter.dto.RentalResponse;
import com.ejercicio.videoclub.adapter.gateway.RentalUseCase;

public class RentalController {
    private RentalUseCase rentalUseCase;

    public RentalController(RentalUseCase rentalUseCase) {
        this.rentalUseCase = rentalUseCase;
    }

    public RentalResponse createRental(RentalRequest rentalRequest) {

        RentalResponse rentalResponse = rentalUseCase.createRental(rentalRequest);
        return rentalResponse;
    }
}

