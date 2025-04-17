package empleado;

/**
 * Clase abstracta que representa un empleado.
 * Define el método calcularSalario que será implementado por las subclases.
 */
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que calcula el salario del empleado.
     */
    public abstract double calcularSalario();
}














///**
// * Clase abstracta que define el método calcularSalario().
// * Todas las subclases deben implementar su propia lógica de cálculo.
// */
//public abstract class Empleado {
//    protected String nombre;
//    protected double salarioBase;
//
//    public Empleado(String nombre, double salarioBase) {
//        this.nombre = nombre;
//        this.salarioBase = salarioBase;
//    }
//
//    public abstract double calcularSalario();
//}

