package com.ejercicio.videoclub.domain.entity;

import com.ejercicio.videoclub.domain.factory.PeliculaFactory;

import java.util.List;

public class VideoClub {
    public Cliente crearCliente(String nombre) {
        return new Cliente(nombre);
    }

    public Pelicula crearPelicula(String titulo, TipoPelicula tipoPelicula) {
        return PeliculaFactory.crearPelicula(titulo, tipoPelicula);
    }

    public Alquiler alquilarPelicula(Cliente cliente, List listaPeliculas, int diasAlquiler) {

        Alquiler alquiler = new Alquiler(cliente, listaPeliculas, diasAlquiler);

        return alquiler;
    }

}
