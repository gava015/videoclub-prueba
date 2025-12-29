package com.ejercicio.videoclub;

import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.factory.PeliculaFactory;
import com.ejercicio.videoclub.domain.factory.PeliculaNuevaFactory;

public class Main {
    public static void main(String[] args) {

        PeliculaFactory factoryNueva = new PeliculaNuevaFactory();

        Pelicula p1 = factoryNueva.crearPelicula("Spiderman");
        Pelicula p2 = factoryNueva.crearPelicula("Zootopia");

        System.out.println("Titulo: " + p1.getTitulo());
        System.out.println("Puntos por dia: " + p1.calcularPuntosFidelizacion(4));

    }
}