package transporte;

/**
 * Clase abstracta que representa un medio de transporte.
 * Tiene un método abstracto que debe ser implementado por las subclases.
 */
public abstract class Transporte {
    protected String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que se implementará según el tipo de transporte.
     */
    public abstract void iniciarRuta();
}
