package com.mx.model;

import com.mx.interfaces.Entregable;

/**
 * Clase Videojuego que representa un videojuego.
 * Implementa la interfaz Entregable.
 */
public class Videojuego extends Base implements Entregable {
    private int horasEstimadas;
    private String genero;
    private String compania;

    // Constructor por defecto.
    public Videojuego() {
        super();
        this.horasEstimadas = 10; // Por defecto, 10 horas.
        this.genero = "";
        this.compania = "";
    }

    // Constructor con título y horas estimadas.
    public Videojuego(String titulo, int horasEstimadas) {
        super(titulo);
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.compania = "";
    }

    // Constructor con todos los atributos, excepto entregado.
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        super(titulo);
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    // Getters y setters.
    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    // Implementación de los métodos de la interfaz Entregable.
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object obj) {
        Videojuego otroVideojuego = (Videojuego) obj;
        return Integer.compare(this.horasEstimadas, otroVideojuego.getHorasEstimadas());
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas estimadas: " + horasEstimadas +
               ", Género: " + genero + ", Compañía: " + compania;
    }
}

