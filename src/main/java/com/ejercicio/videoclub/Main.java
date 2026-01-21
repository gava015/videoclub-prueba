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

import java.util.*;

public class Main {

    private final Scanner consola = new Scanner(System.in);

    private final PeliculaController peliculaController;
    private final AlquilerController alquilerController;

    private final List<Pelicula> peliculas = new ArrayList<>();
    private final List<Cliente> clientes = new ArrayList<>();

    public Main() {
        PeliculaUseCase peliculaUseCase = new PeliculaService();
        AlquilerUseCase alquilerUseCase = new AlquilerService();

        this.peliculaController = new PeliculaController(peliculaUseCase);
        this.alquilerController = new AlquilerController(alquilerUseCase);
    }

    private void mostrarMenu() {
        System.out.println("\n===== VIDEOCLUB =====");
        System.out.println("1. Crear película");
        System.out.println("2. Crear cliente");
        System.out.println("3. Crear alquiler");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void crearPelicula() {
        System.out.print("Título: ");
        String titulo = consola.nextLine();

        System.out.print("Tipo (NUEVA / NORMAL / VIEJA): ");
        TipoPelicula tipo = TipoPelicula.valueOf(consola.nextLine().toUpperCase());

        PeliculaRequest request = new PeliculaRequest(titulo, tipo);
        PeliculaResponse response = peliculaController.crearPelicula(request);

        peliculas.add(new Pelicula(UUID.randomUUID(), titulo, tipo));

        System.out.println("Película creada: " + response.titulo());
    }

    private void crearCliente() {
        System.out.print("Nombre del cliente: ");
        String nombre = consola.nextLine();

        System.out.print("ID del cliente (int): ");
        int id = Integer.parseInt(consola.nextLine());

        Cliente cliente = new Cliente(nombre, id);
        clientes.add(cliente);

        System.out.println("Cliente creado correctamente");
    }

    private void crearAlquiler() {
        if (clientes.isEmpty() || peliculas.isEmpty()) {
            System.out.println("Debe existir al menos un cliente y una película");
            return;
        }

        Cliente cliente = clientes.get(0); // simple para el ejercicio

        System.out.print("Días de alquiler: ");
        int dias = Integer.parseInt(consola.nextLine());

        AlquilerRequest request =
                new AlquilerRequest(cliente, peliculas, dias);

        AlquilerResponse response = alquilerController.crearAlquiler(request);

        System.out.println("Total a pagar: " + response.precio());
        System.out.println("Puntos obtenidos: " +
                response.cliente().getPuntosFidelizacion());
    }

    private void iniciarMenu() {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> crearPelicula();
                case 2 -> crearCliente();
                case 3 -> crearAlquiler();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        new Main().iniciarMenu();
    }
}

