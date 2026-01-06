package com.ejercicio.videoclub.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Alquiler {
    private Cliente cliente;
    private List<Pelicula> listaPeliculas;
    private int alquilerDias;

    public Alquiler(Cliente cliente, List<Pelicula> listaPeliculas, int alquilerDias) {
        this.cliente = cliente;
        this.listaPeliculas = listaPeliculas; // TODO: ANALICE QUE SUCEDE AQUI. Es corrcta la inicialización?
        this.alquilerDias = alquilerDias;
    }

    // TODO: Crear la logica para calcular precio
    public int calcularPrecioAlquiler() {
        int precio = 0;
        //TODO: Terminar la lógica del calculo
        return precio;
    }

    public void asignarPuntosFidelizacion() {
        //TODO: Terminar la lógica
        /*listarPeliculas.stream()
                .map(pelicula -> this.cliente.setPuntosFidelizacion(pelicula.getTipoPelicula().puntosFidelizacion()))
          */
    }


    // TODO: Crear logica para asignar puntos de fidelización


    /*
     public int calcularPrecio() {
        int precio = 0;
        switch (this) {
            case NUEVA:
                return dias * 3000;

            case NORMAL:
                precio = 3 * 3000;
                if (dias > 3) {
                    precio += (dias - 3) * 3000;;
                }
                return precio;

            case VIEJA:
                precio = 5 * 3000;
                if (dias > 5) {
                    precio += (dias - 5) * 3000;
                }
                return precio;

        }
        return precio;
    }*/


}
