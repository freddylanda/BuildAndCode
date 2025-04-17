package transporte;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que crea una lista de transportes (Autobús y Metro)
 * y llama al método iniciarRuta() en cada uno.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una lista que puede contener objetos de tipo Transporte
    	List<Transporte> listaTransportes = new ArrayList<>();

        // Agregar instancias de Autobus y Metro a la lista
        listaTransportes.add(new Autobus("Línea 24"));
        listaTransportes.add(new Metro("Línea 1"));

        // Recorrer la lista y llamar iniciarRuta() para cada transporte
        for (Transporte t : listaTransportes) {
            t.iniciarRuta();
        }
    }
}