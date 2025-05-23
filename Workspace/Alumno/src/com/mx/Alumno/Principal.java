package com.mx.Alumno;

public class Principal {

	public static void main(String args[]) {
		RegistroAlumnos registro = new RegistroAlumnos();

        // Agregar alumnos
        registro.agregarAlumno(1, "Isabella");
        registro.agregarAlumno(2, "Ana");

        // Obtener un alumno y gestionar sus calificaciones
        Alumno alumno1 = registro.obtenerAlumno(1);
        if (alumno1 != null) {
            alumno1.agregarCalificacion("Matemáticas", 8.5);
            alumno1.agregarCalificacion("Historia", 9.0);
            alumno1.mostrarCalificaciones();

            // Modificar calificación existente
            alumno1.modificarCalificacion("Matemáticas", 9.3);
            alumno1.modificarCalificacion("Química", 8.0); // Este no existe, mostrará error
            alumno1.mostrarCalificaciones();
            
         // Eliminar materia
            alumno1.eliminarCalificacion("Historia"); // Historia será eliminada
            alumno1.eliminarCalificacion("Química"); // Intentará eliminar una materia que no existe
            alumno1.mostrarCalificaciones();
        }

        Alumno alumno2 = registro.obtenerAlumno(2);
        if (alumno2 != null) {
            alumno2.agregarCalificacion("Física", 7.2);
            alumno2.agregarCalificacion("Literatura", 8.7);
            alumno2.mostrarCalificaciones();

            // Modificar una calificación
            alumno2.modificarCalificacion("Física", 9.0);
            alumno2.mostrarCalificaciones();
        }

        // Mostrar lista de alumnos
        registro.mostrarAlumnos();
		
	}
}
