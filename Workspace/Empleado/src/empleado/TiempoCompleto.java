package empleado;

/**
 * Clase que representa a un empleado de tiempo completo.
 * Calcula el salario como sueldo fijo mensual.
 */
public class TiempoCompleto extends Empleado {
    private double sueldoMensual;

    public TiempoCompleto(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }
}














///**
// * Clase TiempoCompleto que extiende Empleado y calcula el salario mensual completo.
// */
//public class TiempoCompleto extends Empleado {
//    public TiempoCompleto(String nombre, double salarioBase) {
//        super(nombre, salarioBase);
//    }
//
//    @Override
//    public double calcularSalario() {
//        return salarioBase; // Asumiendo un salario fijo mensual
//    }
//}
