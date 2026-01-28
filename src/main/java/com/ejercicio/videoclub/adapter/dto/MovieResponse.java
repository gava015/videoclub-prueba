package com.ejercicio.videoclub.adapter.dto;

import com.ejercicio.videoclub.domain.entity.MovieType;
import java.util.UUID;

public record MovieResponse(UUID movieId, String title, MovieType movieType) {
}
