package transporte;

/**
 * Subclase de Transporte que representa un Metro.
 * Implementa la lógica específica de iniciarRuta().
 */
public class Metro extends Transporte {

    public Metro(String nombre) {
        super(nombre);
    }

    @Override
    public void iniciarRuta() {
        System.out.println("Metro " + nombre + " inicia su ruta subterránea.");
    }
}
