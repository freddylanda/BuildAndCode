package com.mx.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{

	
	//Declarar una lista para peliculas
	//Interface que contiene metodos especificos para almacenar información
	List<Pelicula> lista = new ArrayList<Pelicula>();
		
	@Override
	public void guardar(Pelicula pelicula) {
		lista.add(pelicula);
		
	}

	@Override
	public void editar(int indice, Pelicula pelicula) {
		lista.set(indice, pelicula);
		
	}

	@Override
	public void mostrar() {
		System.out.println(lista+"\n");
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Pelicula buscar(int indice) {
		return lista.get(indice);
	}
	
	//Metodo personalizado para contar la cantidad de elementos de la lista
	public void contar() {
		int cont = lista.size();
		System.out.println("La lista contiene: " + cont + " Peliculas\n");
	}

}
