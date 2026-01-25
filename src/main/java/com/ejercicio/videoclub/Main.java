package com.ejercicio.videoclub;

import com.ejercicio.videoclub.adapter.controller.RentalController;
import com.ejercicio.videoclub.adapter.controller.MovieController;
import com.ejercicio.videoclub.adapter.dto.*;
import com.ejercicio.videoclub.adapter.gateway.RentalUseCase;
import com.ejercicio.videoclub.adapter.gateway.MovieUseCase;
import com.ejercicio.videoclub.domain.entity.User;
import com.ejercicio.videoclub.domain.entity.Movie;
import com.ejercicio.videoclub.domain.entity.MovieType;
import com.ejercicio.videoclub.domain.usecase.RentalService;
import com.ejercicio.videoclub.domain.usecase.MovieService;

import java.util.*;

public class Main {

    private final Scanner consola = new Scanner(System.in);

    private final MovieController movieController;
    private final RentalController rentalController;

    private final List<Movie> movies = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    public Main() {
        MovieUseCase movieUseCase = new MovieService();
        RentalUseCase rentalUseCase = new RentalService();

        this.movieController = new MovieController(movieUseCase);
        this.rentalController = new RentalController(rentalUseCase);
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
        MovieType tipo = MovieType.valueOf(consola.nextLine().toUpperCase());

        MovieRequest request = new MovieRequest(titulo, tipo);
        MovieResponse response = movieController.crearPelicula(request);

        movies.add(new Movie(UUID.randomUUID(), titulo, tipo));

        System.out.println("Película creada: " + response.title());
    }

    private void crearCliente() {
        System.out.print("Nombre del cliente: ");
        String name = consola.nextLine();

        System.out.print("ID del cliente (int): ");
        int userId = Integer.parseInt(consola.nextLine());

        User user = new User(userId,name);
        users.add(user);

        System.out.println("Cliente creado correctamente");
    }

    private void crearAlquiler() {
        if (users.isEmpty() || movies.isEmpty()) {
            System.out.println("Debe existir al menos un cliente y una película");
            return;
        }

        User user = users.get(0);

        System.out.print("Días de alquiler: ");
        int dias = Integer.parseInt(consola.nextLine());

        RentalRequest request =
                new RentalRequest(user, movies, dias);

        RentalResponse response = rentalController.createRental(request);

        System.out.println("Total a pagar: " + response.price());
        System.out.println("Puntos obtenidos: " +
                response.user().getLoyaltyPoints());
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

