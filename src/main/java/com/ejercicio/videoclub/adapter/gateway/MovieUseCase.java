package com.ejercicio.videoclub.adapter.gateway;

import com.ejercicio.videoclub.adapter.dto.MovieRequest;
import com.ejercicio.videoclub.domain.entity.Movie;

public interface MovieUseCase {
    Movie createMovie(MovieRequest movieRequest);
}
