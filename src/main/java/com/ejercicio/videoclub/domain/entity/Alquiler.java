package com.ejercicio.videoclub.domain.entity;
import java.util.List;

public class Alquiler {
    private Cliente cliente;
    private List<Pelicula> listaPeliculas;
    private int alquilerDias;

    public Alquiler(Cliente cliente, List<Pelicula> listaPeliculas, int alquilerDias) {
        this.cliente = cliente;
        this.listaPeliculas = listaPeliculas;
        this.alquilerDias = alquilerDias;
    }

    public int calcularPrecioAlquiler() {
        int precio = 0;
        for (Pelicula pelicula : listaPeliculas) {
            TipoPelicula tipoPelicula = pelicula.getTipoPelicula();

            switch (tipoPelicula) {
                case NUEVA:
                    return alquilerDias * 3000;

                case NORMAL:
                    precio = 3 * 3000;
                    if (alquilerDias > 3) {
                        precio += (alquilerDias - 3) * 3000;
                    }
                    return precio;

                case VIEJA:
                    precio = 5 * 3000;
                    if (alquilerDias > 5) {
                        precio += (alquilerDias - 5) * 3000;
                    }
                    return precio;
            }
        }
        return precio;
    }

    public void asignarPuntosFidelizacion() {
        int totalPuntos = 0;

        for(Pelicula pelicula: listaPeliculas){
          totalPuntos += pelicula.getTipoPelicula().getPuntosFidelizacion();
        }
        cliente.setPuntosFidelizacion(totalPuntos);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public int getAlquilerDias() {
        return alquilerDias;
    }

    public void setAlquilerDias(int alquilerDias) {
        this.alquilerDias = alquilerDias;
    }
}
