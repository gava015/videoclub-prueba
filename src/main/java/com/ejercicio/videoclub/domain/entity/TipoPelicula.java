package com.ejercicio.videoclub.domain.entity;

public enum TipoPelicula {
    NUEVA,
    NORMAL,
    VIEJA;

    public int calcularPrecio(int dias) {
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
    }
}
