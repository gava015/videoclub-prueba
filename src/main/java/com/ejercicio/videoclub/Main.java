package com.ejercicio.videoclub;

import com.ejercicio.videoclub.adapter.controller.AlquilerController;
import com.ejercicio.videoclub.adapter.controller.PeliculaController;
import com.ejercicio.videoclub.adapter.dto.*;
import com.ejercicio.videoclub.adapter.gateway.AlquilerUseCase;
import com.ejercicio.videoclub.adapter.gateway.PeliculaUseCase;
import com.ejercicio.videoclub.domain.entity.Cliente;
import com.ejercicio.videoclub.domain.entity.Pelicula;
import com.ejercicio.videoclub.domain.entity.TipoPelicula;
import com.ejercicio.videoclub.domain.usecase.AlquilerService;
import com.ejercicio.videoclub.domain.usecase.PeliculaService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear un Menú
        PeliculaUseCase peliculaUseCase = new PeliculaService();
        PeliculaController controller = new PeliculaController(peliculaUseCase);
        PeliculaRequest peliculaRequest1 = new PeliculaRequest("Zootopia", TipoPelicula.NUEVA);
        PeliculaResponse response =
                controller.crearPelicula(peliculaRequest1);
        System.out.println(response);

        UUID peliculaId = UUID.randomUUID();
        List<Pelicula> listaPeliculas = new ArrayList<>();

        listaPeliculas.add(new Pelicula(peliculaId,"Zootopia", TipoPelicula.NUEVA));
        listaPeliculas.add(new Pelicula(peliculaId,"Matrix", TipoPelicula.NORMAL));
        listaPeliculas.add(new Pelicula(peliculaId,"Titanic", TipoPelicula.VIEJA));

        Cliente cliente = new Cliente("Valentina", 123);

        AlquilerUseCase alquilerUseCase = new AlquilerService();
        AlquilerController alquilerController = new AlquilerController(alquilerUseCase);

        AlquilerRequest alquilerRequest = new AlquilerRequest(cliente, listaPeliculas, 3
        );

        AlquilerResponse alquilerResponse = alquilerController.crearAlquiler(alquilerRequest);

        System.out.println("Total costo: " + alquilerResponse.precio());

        System.out.println("Puntos adquiridos: " +
                alquilerResponse.cliente().getPuntosFidelizacion()
        );
    }
}