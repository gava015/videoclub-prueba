package com.ejercicio.videoclub;

import com.ejercicio.videoclub.domain.entity.Alquiler;
import com.ejercicio.videoclub.domain.entity.Cliente;
import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.entity.TipoPelicula;
import com.ejercicio.videoclub.domain.factory.PeliculaFactory;

public class Main {
    public static void main(String[] args) {


        Pelicula pelicula = PeliculaFactory.crearPelicula(
                "Matrix",
                TipoPelicula.NUEVA
        );


        Cliente cliente = new Cliente("Valentina");


        Alquiler alquiler = new Alquiler(cliente, pelicula, 3);

        //int precio = alquiler.calcularPrecio();

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Película: " + pelicula.getTitulo());
        System.out.println("Tipo: " + pelicula.getTipoPelicula());
        System.out.println("Días: " + alquiler.getDias());
        //System.out.println("Precio total: $" + precio);

    }
}