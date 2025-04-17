package inventario;


public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}

///**
// * Clase base Producto con atributos comunes.
// */
//public abstract class Producto {
//    protected String codigo;
//    protected String nombre;
//    protected double precio;
//
//    public Producto(String codigo, String nombre, double precio) {
//        this.codigo = codigo;
//        this.nombre = nombre;
//        this.precio = precio;
//    }
//
//    public String getCodigo() {
//        return codigo;
//    }
//
////    @Override
////    public String toString() {
////        return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: $" + precio;
////    }
//    
//    // Método abstracto que obliga a las subclases a implementar su lógica específica.
//    public abstract void mostrarDetalles();
//
//}

