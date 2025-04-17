package empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que calcula la nómina total de varios empleados.
 */
public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new TiempoCompleto("Ana", 2500.0));
        empleados.add(new MedioTiempo("Luis", 80, 15.5));
        empleados.add(new MedioTiempo("Carla", 60, 18.0));

        double nominaTotal = 0.0;

        for (Empleado emp : empleados) {
            double salario = emp.calcularSalario();
            System.out.println("Empleado: " + emp.nombre + " | Salario: $" + salario);
            nominaTotal += salario;
        }

        System.out.println("Nómina total: $" + nominaTotal);
    }
}

















///**
// * Clase principal que almacena empleados y calcula la nómina total.
// */
//public class Main {
//    public static void main(String[] args) {
//        List<Empleado> empleados = new ArrayList<>();
//        empleados.add(new TiempoCompleto("Carlos", 30000));
//        empleados.add(new MedioTiempo("Ana", 20000, 80));
//
//        double nominaTotal = 0;
//        for (Empleado empleado : empleados) {
//            double salario = empleado.calcularSalario();
//            System.out.println(empleado.nombre + " - Salario: $" + salario);
//            nominaTotal += salario;
//        }
//
//        System.out.println("Nómina total: $" + nominaTotal);
//    }
//}

