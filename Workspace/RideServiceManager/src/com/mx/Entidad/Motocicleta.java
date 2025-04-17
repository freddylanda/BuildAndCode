package com.mx.Entidad;

import java.util.ArrayList;
import java.util.List;

public class Motocicleta {
	private int id;
    private String marca;
    private String modelo;
    private int anio;
    private List<Servicio> historialServicios;

    public Motocicleta(int id, String marca, String modelo, int anio) {
        if (anio <= 0) throw new IllegalArgumentException("El año debe ser mayor a 0.");
        if (marca.isEmpty() || modelo.isEmpty()) throw new IllegalArgumentException("Marca y modelo no pueden ser vacíos.");
        
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.historialServicios = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
    public List<Servicio> getHistorialServicios() { return historialServicios; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAnio(int anio) {
        if (anio <= 0) throw new IllegalArgumentException("El año debe ser mayor a 0.");
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", historialServicios=" + historialServicios +
                '}';
    }

}
