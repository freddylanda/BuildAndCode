package transporte;

/**
 * Subclase de Transporte que representa un Autobús.
 * Implementa la lógica específica de iniciarRuta().
 */
public class Autobus extends Transporte {

    public Autobus(String nombre) {
        super(nombre);
    }

    @Override
    public void iniciarRuta() {
        System.out.println("Autobús " + nombre + " está comenzando su ruta por la ciudad.");
    }
}