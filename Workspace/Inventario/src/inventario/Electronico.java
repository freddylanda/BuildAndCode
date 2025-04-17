package inventario;

public class Electronico extends Producto {
    private int garantiaMeses;

    public Electronico(String codigo, String nombre, double precio, int garantiaMeses) {
        super(codigo, nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}





///**
// * Clase Electronico que extiende Producto y agrega garantía.
// */
//public class Electronico extends Producto {
//    private int garantiaMeses;
//
//    public Electronico(String codigo, String nombre, double precio, int garantiaMeses) {
//        super(codigo, nombre, precio);
//        this.garantiaMeses = garantiaMeses;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + ", Garantía: " + garantiaMeses + " meses";
//    }
//    
////    @Override
////    public void mostrarDetalles() {
////        System.out.println("Electrónico: " + nombre + " - Garantía: " + garantiaMeses + " meses");
////    }
//    
//    @Override
//    public void mostrarDetalles() {
//        System.out.println("Electrónico: Código = " + codigo + ", Nombre = " + nombre 
//                           + ", Precio = $" + precio + ", Garantía = " + garantiaMeses + " meses");
//    }
//
//
//}

