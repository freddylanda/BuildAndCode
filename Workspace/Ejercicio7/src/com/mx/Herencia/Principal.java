package com.mx.Herencia;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar
		Hijo hijo1 = new Hijo("Mabel", "Miller", 18, 1.75, "UK", "Cafe", "Delgada");
		Hijo hijo2 = new Hijo("Yanelli", "Jones", 20, 1.70, "EEUU", "Negro", "Delgada");
		Hijo hijo3 = new Hijo("Alexandra", "Jimenez", 20, 1.70, "MX", "Cafe", "Delgada");
		
		System.out.println(hijo1);
		
		hijo1.setNombre("Maya");
		hijo1.setEdad(19);
		
		System.out.println(hijo1);
		
		hijo1.trabajar();

	}

}
