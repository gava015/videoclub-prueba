package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.User;
import java.util.List;

public record RentalRequest(User user, List movieList, int rentalDays) {
}
