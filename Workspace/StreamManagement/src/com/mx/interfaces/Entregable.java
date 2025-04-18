package com.mx.interfaces;

/**
 * Interfaz Entregable que define los métodos comunes para las clases Serie y
 * Videojuego.
 */
public interface Entregable {
	// Método para marcar el objeto como entregado.
	void entregar();

	// Método para devolver el objeto y marcarlo como no entregado.
	void devolver();

	// Método que verifica si el objeto está entregado.
	boolean isEntregado();

	/**
	 * Método que compara objetos de tipo Serie y Videojuego.
	 * 
	 * @param obj Objeto a comparar.
	 * @return Un valor comparativo basado en temporadas o horas estimadas.
	 */
	int compareTo(Object obj);
}
