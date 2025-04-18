package com.mx.model;

/**
 * Clase base que contiene atributos comunes para las clases Serie y Videojuego.
 */
public abstract class Base {
	protected String titulo;
	protected boolean entregado;

	// Constructor por defecto.
	public Base() {
		this.titulo = "";
		this.entregado = false;
	}

	// Constructor con título.
	public Base(String titulo) {
		this.titulo = titulo;
		this.entregado = false;
	}

	// Métodos getters y setters para el título.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + ", Entregado: " + entregado;
	}
}
