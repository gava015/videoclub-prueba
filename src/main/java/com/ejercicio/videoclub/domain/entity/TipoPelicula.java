package com.ejercicio.videoclub.domain.entity;

public enum TipoPelicula {
    NUEVA,
    NORMAL,
    VIEJA;

    public int calcularPuntos(int dias) {
        switch (this) {
            case NUEVA:
                return dias * 3000;

            case NORMAL:
                int precio = 3 * 3000;
                if (dias > 3) {
                    precio += (dias - 3) * 3;
                }
                return precio;

            case VIEJA:
                int precio = 5 * 3000;
                if (dias > 5) {
                    precio += (dias - 5) * 3000;
                }
                return precio;

        }
        return ;
    }
}
