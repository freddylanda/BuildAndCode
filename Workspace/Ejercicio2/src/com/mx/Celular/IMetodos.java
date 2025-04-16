package com.mx.Celular;

public interface IMetodos {
	
	//metodo abstracto
	//modificador de acceso, valor de retorno, firma del método y valores que puede recibir
	public void guardar(Celular celular);
	
	public void editar(int indice, Celular celular);
	
	public void mostrar();
	
	public void eliminar(int indice);
	
	public Celular buscar(int indice);
	
	
}
