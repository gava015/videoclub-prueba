package com.ejercicio.videoclub.adapter.controller;

import com.ejercicio.videoclub.adapter.dto.MovieRequest;
import com.ejercicio.videoclub.adapter.dto.MovieResponse;
import com.ejercicio.videoclub.adapter.gateway.MovieUseCase;
import com.ejercicio.videoclub.domain.entity.Movie;

public class MovieController {
    private MovieUseCase movieUseCase;
    public MovieController(MovieUseCase movieUseCase) {
        this.movieUseCase = movieUseCase;
    }

    public MovieResponse crearPelicula(MovieRequest movieRequest) {

        Movie movie = movieUseCase.createMovie(movieRequest);
        MovieResponse movieResponse = new MovieResponse(movie.getMovieId(), movie.getTitle(), movie.getMovieType());

        return movieResponse;
    }
}
