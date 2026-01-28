package com.ejercicio.videoclub.domain.repository;

import com.ejercicio.videoclub.domain.entity.Rental;
import com.ejercicio.videoclub.domain.entity.User;
import com.ejercicio.videoclub.domain.entity.Movie;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class VideoClubData {
    private static VideoClubData instance;
    private List<User> users;
    private List<Movie> movies;
    private List<Rental> rentals;

    private VideoClubData() {
        users = new ArrayList<>();
        movies = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public static VideoClubData getInstance() {
        if (instance == null) {
            instance = new VideoClubData();
        }
        return instance;
    }
}

