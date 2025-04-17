package com.mx.Principal;

import com.mx.Entidades.Abogado;
import com.mx.Entidades.Medico;

public class Principal {

	public static void main(String[] args) {
		
		//Instancias abogado
		
		Abogado abogado = new Abogado("Raúl", "Mendoza", 27, 898392, "UNAM", 4, "Fiscal", "Bufete Hermanos Mendoza", 1700);
		System.out.println(abogado);
		
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		//Medico
		System.out.println("-----");
		Medico medico = new Medico("Manuel", "Figueróa", 29, 74564, "UNAM", 7, "Familiar", "Consultiro Medico", 2000);
		System.out.println(medico);
		
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());
		
	}
	
	/*
	 * 
	 * Ejercicio 1.
	 * 
	 * Crear una clase abstracta Trasporte con métodos abstractos como: iniciarRuta()
	 * Implementa subClase Autobus y Metro con su propia lógica de ruta.
	 * Usa una lista de transporte y llama a iniciarRuta en cada uno.
	 * 
	 * Ejercicio 2.
	 * Crear una clase abstracta Empleado con metodos como: calcularSalario();
	 * Implementa subClase TiempoCompleto y MedioTiempo, cada uno con su propio Calculo de trabajo.
	 * Usa una lista para almacenar y calcular la nímina total.
	 * 
	 * Ejercicio 3.
	 * Usar un HashMap<String, Producto> donde la clave sea el código del producto.
	 * Crear una jerarquía (tipo herencia) con Producto, Electronico y Alimento donde cada uno tenga atributos especificos.
	 * Implementar métodos para agregar buscar y eliminar.
	 *
	 *
	 * */

}
