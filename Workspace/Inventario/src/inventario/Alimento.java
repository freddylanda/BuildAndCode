package inventario;

import java.time.LocalDate;

public class Alimento extends Producto {
    private LocalDate fechaExpiracion;

    public Alimento(String codigo, String nombre, double precio, LocalDate fechaExpiracion) {
        super(codigo, nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de expiración: " + fechaExpiracion);
    }
}






///**
// * Clase Alimento que extiende Producto y agrega fecha de caducidad.
// */
//import java.time.LocalDate;
//
//public class Alimento extends Producto {
//    private LocalDate fechaCaducidad;
//
//    public Alimento(String codigo, String nombre, double precio, LocalDate fechaCaducidad) {
//        super(codigo, nombre, precio);
//        this.fechaCaducidad = fechaCaducidad;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + ", Fecha de caducidad: " + fechaCaducidad;
//    }
//    
////    @Override
////    public void mostrarDetalles() {
////        System.out.println("Alimento: " + nombre + " - Caducidad: " + fechaCaducidad);
////    }
//
//    @Override
//    public void mostrarDetalles() {
//        System.out.println("Alimento: Código = " + codigo + ", Nombre = " + nombre 
//                           + ", Precio = $" + precio + ", Fecha de Caducidad = " + fechaCaducidad);
//    }
//
//}
