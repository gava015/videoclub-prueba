package com.ejercicio.videoclub;

import com.ejercicio.videoclub.adapter.controller.AlquilerController;
import com.ejercicio.videoclub.adapter.controller.PeliculaController;
import com.ejercicio.videoclub.adapter.dto.PeliculaRequest;
import com.ejercicio.videoclub.adapter.dto.PeliculaResponse;
import com.ejercicio.videoclub.adapter.gateway.PeliculaUseCase;
import com.ejercicio.videoclub.domain.entity.TipoPelicula;
import com.ejercicio.videoclub.domain.usecase.PeliculaService;


public class Main {
    public static void main(String[] args) {

        PeliculaUseCase peliculaUseCase = new PeliculaService();

        PeliculaController controller = new PeliculaController(peliculaUseCase);

        PeliculaRequest request =
                new PeliculaRequest("Zootopia", TipoPelicula.NUEVA);

        PeliculaResponse response =
                controller.crearPelicula(request);

        System.out.println(response);
    }
}