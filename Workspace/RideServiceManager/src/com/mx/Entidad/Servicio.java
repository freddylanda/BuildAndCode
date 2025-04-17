package com.mx.Entidad;

import java.time.LocalDate;

public class Servicio {
	private String descripcion;
    private double costo;
    private LocalDate fecha;

    public Servicio(String descripcion, double costo, LocalDate fecha) {
        if (costo <= 0) throw new IllegalArgumentException("El costo debe ser mayor a 0.");
        if (descripcion.isEmpty()) throw new IllegalArgumentException("La descripción no puede ser vacía.");

        this.descripcion = descripcion;
        this.costo = costo;
        this.fecha = fecha;
    }

    public String getDescripcion() { return descripcion; }
    public double getCosto() { return costo; }
    public LocalDate getFecha() { return fecha; }

    @Override
    public String toString() {
        return "Servicio{" +
                "descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                ", fecha=" + fecha +
                '}';
    }

}
