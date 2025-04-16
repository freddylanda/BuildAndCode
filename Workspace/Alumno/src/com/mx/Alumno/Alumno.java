package com.mx.Alumno;

import java.util.HashMap;

public class Alumno implements IGestionCalificaciones{
	
	private String nombre;
	private HashMap<String, Double> calificaciones;

	
	public Alumno(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new HashMap<>();
    }

	public String getNombre() {
		return nombre;
	}
	
	@Override
    public void agregarCalificacion(String materia, double calificacion) {
        if (calificacion >= 0.0 && calificacion <= 10.0) {
            calificaciones.put(materia, calificacion);
            System.out.println("Calificación agregada: " + materia + " -> " + calificacion);
        } else {
            System.out.println("Error: La calificación debe estar entre 0.0 y 10.0.");
        }
    }

    @Override
    public void eliminarCalificacion(String materia) {
        if (calificaciones.containsKey(materia)) {
            calificaciones.remove(materia);
            System.out.println("Calificación eliminada: " + materia);
        } else {
            System.out.println("Error: La materia no existe.");
        }
    }

    public void modificarCalificacion(String materia, double nuevaCalificacion) {
        if (calificaciones.containsKey(materia)) {
            if (nuevaCalificacion >= 0.0 && nuevaCalificacion <= 10.0) {
                calificaciones.put(materia, nuevaCalificacion);
                System.out.println("Calificación modificada: " + materia + " -> " + nuevaCalificacion);
            } else {
                System.out.println("Error: La nueva calificación debe estar entre 0.0 y 10.0.");
            }
        } else {
            System.out.println("Error: La materia no existe.");
        }
    }

    @Override
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (HashMap.Entry<String, Double> entry : calificaciones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
