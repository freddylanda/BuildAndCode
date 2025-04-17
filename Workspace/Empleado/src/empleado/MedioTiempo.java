package empleado;

/**
 * Clase que representa a un empleado de medio tiempo.
 * Calcula el salario en base a horas trabajadas y tarifa por hora.
 */
public class MedioTiempo extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public MedioTiempo(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}













///**
// * Clase MedioTiempo que extiende Empleado y calcula el salario con base en medio tiempo.
// */
//public class MedioTiempo extends Empleado {
//    private int horasTrabajadas;
//
//    public MedioTiempo(String nombre, double salarioBase, int horasTrabajadas) {
//        super(nombre, salarioBase);
//        this.horasTrabajadas = horasTrabajadas;
//    }
//
//    @Override
//    public double calcularSalario() {
//        return salarioBase * (horasTrabajadas / 160.0); // Asumiendo 160 horas en tiempo completo
//    }
//}

