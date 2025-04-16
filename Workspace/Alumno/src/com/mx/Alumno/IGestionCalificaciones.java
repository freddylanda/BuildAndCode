package com.mx.Alumno;

public interface IGestionCalificaciones {
	
	void agregarCalificacion(String materia, double calificacion);
    void eliminarCalificacion(String materia);
    void modificarCalificacion(String materia, double nuevaCalificacion);
    void mostrarCalificaciones();

}
