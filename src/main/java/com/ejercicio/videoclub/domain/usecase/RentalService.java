package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.RentalRequest;
import com.ejercicio.videoclub.adapter.dto.RentalResponse;
import com.ejercicio.videoclub.adapter.gateway.RentalUseCase;
import com.ejercicio.videoclub.domain.entity.Rental;
import com.ejercicio.videoclub.domain.repository.VideoClubData;

public class RentalService implements RentalUseCase {

    private final VideoClubData data = VideoClubData.getInstance();

    @Override
    public RentalResponse createRental(RentalRequest rentalRequest) {

        if (rentalRequest.user() == null) {
            throw new IllegalArgumentException("User is required");
        }

        if(rentalRequest.movieList().isEmpty() || rentalRequest.movieList() == null){
            throw new IllegalArgumentException("Movie list cannot be empty");
        }

        if(rentalRequest.rentalDays() < 1){
            throw new IllegalArgumentException("Rental days must be at least one");
        }

        Rental rental = new Rental(rentalRequest.user(), rentalRequest.movieList(), rentalRequest.rentalDays());

        RentalResponse rentalResponse = new RentalResponse(
                rental.getUser(),
                rental.getMovieList(),
                rental.getRentalDays(),
                rental.calculateRentalPrice());
        rental.addLoyaltyPoints();

        data.getRentals().add(rental);
        return rentalResponse;
    }
}
