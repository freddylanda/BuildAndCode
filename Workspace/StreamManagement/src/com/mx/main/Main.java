package com.mx.main;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.mx.model.Serie;
import com.mx.model.Videojuego;

/**
 * Clase Aplicacion: Punto de entrada del programa. Realiza las operaciones
 * solicitadas en el proyecto.
 */
public class Main {

	public static void main(String[] args) {
		// 1. Crear arrays de Series y Videojuegos.
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		// 2. Crear objetos con distintos constructores y asignarlos a los arrays.
		series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		series[1] = new Serie("Game of Thrones", 8, "Fantasía", "George R.R. Martin");
		series[2] = new Serie("Stranger Things", 4, "Ciencia Ficción", "Hermanos Duffer");
		series[3] = new Serie("The Office", 9, "Comedia", "Greg Daniels");
		series[4] = new Serie("Chernobyl", 1, "Drama Histórico", "Craig Mazin");

		videojuegos[0] = new Videojuego("The Witcher 3", 50, "RPG", "CD Projekt Red");
		videojuegos[1] = new Videojuego("Cyberpunk 2077", 60, "RPG", "CD Projekt Red");
		videojuegos[2] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
		videojuegos[3] = new Videojuego("Halo Infinite", 40, "FPS", "343 Industries");
		videojuegos[4] = new Videojuego("FIFA 22", 30, "Deportes", "EA Sports");

		// 3. Entregar algunas Series y Videojuegos.
		series[1].entregar(); // Game of Thrones
		series[3].entregar(); // The Office
		videojuegos[0].entregar(); // The Witcher 3
		videojuegos[4].entregar(); // FIFA 22

		// *** Comprobar el estado de cada elemento después de entregar
		// ***
		// Estatus de las Series
		System.out.println("\nEstatus de las Series:");
		IntStream.range(0, series.length).forEach(i -> System.out.println(
				"Serie " + (i + 1) + " - " + series[i].getTitulo() + ": Entregado = " + series[i].isEntregado()));

		// Estatus de los Videojuegos
		System.out.println("\nEstatus de los Videojuegos:");
		IntStream.range(0, videojuegos.length).forEach(i -> System.out.println("Videojuego " + (i + 1) + " - "
				+ videojuegos[i].getTitulo() + ": Entregado = " + videojuegos[i].isEntregado()));

		// 4. Contar cuántos están entregados.
		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;

		for (Serie serie : series) {
			if (serie.isEntregado()) {
				seriesEntregadas++;
				serie.devolver(); // Devolver la serie después de contar.
			}
		}

		for (Videojuego videojuego : videojuegos) {
			if (videojuego.isEntregado()) {
				videojuegosEntregados++;
				videojuego.devolver(); // Devolver el videojuego después de contar.
			}
		}

		System.out.println("Series entregadas: " + seriesEntregadas);
		System.out.println("Videojuegos entregados: " + videojuegosEntregados);

		// 5. Encontrar la serie con más temporadas y el videojuego con más horas estimadas.
		// Encontrar la serie con más temporadas usando una expresión lambda
		Serie serieMayor = Arrays.stream(series)
				.max((s1, s2) -> Integer.compare(s1.getNumeroTemporadas(), s2.getNumeroTemporadas())).orElse(null);

		System.out.println("\nSerie con más temporadas:");
		if (serieMayor != null) {
			System.out.println(serieMayor);
		}

		// Encontrar el videojuego con más horas estimadas usando una expresión lambda
		Videojuego videojuegoMayor = Arrays.stream(videojuegos)
				.max((v1, v2) -> Integer.compare(v1.getHorasEstimadas(), v2.getHorasEstimadas())).orElse(null);

		System.out.println("\nVideojuego con más horas estimadas:");
		if (videojuegoMayor != null) {
			System.out.println(videojuegoMayor);
		}

	}
}
