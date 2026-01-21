package com.ejercicio.videoclub.domain.usecase;

import com.ejercicio.videoclub.adapter.dto.MovieRequest;
import com.ejercicio.videoclub.adapter.gateway.MovieUseCase;
import com.ejercicio.videoclub.domain.entity.Movie;
import com.ejercicio.videoclub.domain.repository.VideoClubData;

import java.util.UUID;

public class MovieService implements MovieUseCase {
    private final VideoClubData data = VideoClubData.getInstance();

    @Override
    public Movie createMovie(MovieRequest movieRequest) {

        if (movieRequest.title() == null || movieRequest.title().isBlank()) {
            throw new IllegalArgumentException("Title is required");
        }

        if(movieRequest.movieType() == null) {
            throw new IllegalArgumentException("Movie type is required");
        }

        UUID Id = UUID.randomUUID();
        Movie movie = new Movie(Id, movieRequest.title(), movieRequest.movieType());
        data.getMovies().add(movie);

        return movie;
    }

    // TODO: Crear el flujo para listar las peliculas (peliculas por tipo)
}


