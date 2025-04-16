package Implementacion;

//Uso del extends: palabra reservada que hereda todos los metodos de la superclase
public class impFruta extends ImplementacionGenerica{
	
	//Metodo personalizado
	
	public void contar() {
		System.out.println("El HashMap contiene: "+hash.size()+" frutas.");
	}

}
