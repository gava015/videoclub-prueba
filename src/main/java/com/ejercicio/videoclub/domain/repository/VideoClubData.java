package com.ejercicio.videoclub.domain.repository;

import com.ejercicio.videoclub.domain.entity.Alquiler;
import com.ejercicio.videoclub.domain.entity.Cliente;
import com.ejercicio.videoclub.domain.entity.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class VideoClubData {
    private static VideoClubData instance;
    private List<Cliente> clientes;
    private List<Pelicula> peliculas;
    private List<Alquiler> alquileres;

    private VideoClubData() {
        clientes = new ArrayList<>();
        peliculas = new ArrayList<>();
        alquileres = new ArrayList<>();
    }

    public static VideoClubData getInstance() {
        if (instance == null) {
            instance = new VideoClubData();
        }
        return instance;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
}

