package com.mx.model;

import com.mx.interfaces.Entregable;

/**
 * Clase Serie que representa una serie de televisión.
 * Implementa la interfaz Entregable.
 */
public class Serie extends Base implements Entregable {
    private int numeroTemporadas;
    private String genero;
    private String creador;

    // Constructor por defecto.
    public Serie() {
        super();
        this.numeroTemporadas = 3; // Por defecto, 3 temporadas.
        this.genero = "";
        this.creador = "";
    }

    // Constructor con título y creador.
    public Serie(String titulo, String creador) {
        super(titulo);
        this.numeroTemporadas = 3; // Por defecto, 3 temporadas.
        this.genero = "";
        this.creador = creador;
    }

    // Constructor con todos los atributos, excepto entregado.
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        super(titulo);
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    // Getters y setters.
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
        Serie otraSerie = (Serie) obj;
        return Integer.compare(this.numeroTemporadas, otraSerie.getNumeroTemporadas());
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de temporadas: " + numeroTemporadas +
               ", Género: " + genero + ", Creador: " + creador;
    }
}

