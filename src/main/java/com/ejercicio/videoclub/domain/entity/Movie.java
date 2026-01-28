package com.ejercicio.videoclub.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {

    private UUID movieId;
    private String title;
    private MovieType movieType;
}
