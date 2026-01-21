package com.ejercicio.videoclub.adapter.gateway;

import com.ejercicio.videoclub.adapter.dto.RentalRequest;
import com.ejercicio.videoclub.adapter.dto.RentalResponse;

public interface RentalUseCase {
    RentalResponse createRental(RentalRequest rentalRequest);
}
