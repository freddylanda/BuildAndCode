package Principal;

import com.mx.Entidades.Fruta;

import Implementacion.impFruta;

public class Principal {

	public static void main(String[] args) {

		//Instanciar Fruta
		
		Fruta fr1 = new Fruta("Mango", "Amarillo", 23.5, 1.5, "Verano");		
		Fruta fr2 = new Fruta("Melón", "Verde", 12.8, 1, "Verano");		
		Fruta fr3 = new Fruta("Sandía", "Rojo", 44.5, 3, "Invierno");
		Fruta fr4 = new Fruta("Mamey", "Cafe", 30.69, 4, "Primavera");
		Fruta fr5 = new Fruta("Ciruela", "Rojo", 45.99, 2.5, "Verano");
		
		//Objeto Auxiliar
		Fruta fruta = null;
		impFruta impF = new impFruta();
		
		//Guardar
		impF.guardar(fr1.getNombre(), fr1);
		impF.guardar(fr2.getNombre(), fr2);
		impF.guardar(fr3.getNombre(), fr3);
		impF.guardar(fr4.getNombre(), fr4);
		impF.guardar(fr5.getNombre(), fr5);
		
		//Mostrar
		impF.mostrar();
		
		//Buscar
		//Casteo: cambio de datos
		fruta = (Fruta) impF.buscar(fr1.getNombre());
		System.out.println("Encontrada: "+fruta);
		
		//Eliminar
		//
		impF.eliminar(fr5.getNombre());
		impF.mostrar();
		
		//Contar
		impF.contar();
		
		//Realizar el uso de la clase Object con una lista generica(no usar HashMap)
		//Debemos usar 3 entidades diferentes, cada entidad debera tener por lo menos 4 instancias
		//Todos deben llevar las pruebas(agregar, mostrar, editar, eliminar, buscar y contar)
		
	}

}
