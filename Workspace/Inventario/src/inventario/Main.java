package inventario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Electronico laptop = new Electronico("E001", "Laptop Lenovo", 1200.50, 24);
        Alimento manzana = new Alimento("A001", "Manzana Roja", 0.99, LocalDate.of(2025, 5, 10));

        // Agregar productos
        inventario.agregarProducto(laptop);
        inventario.agregarProducto(manzana);

        System.out.println();

        // Buscar productos
        inventario.buscarProducto("E001");
        System.out.println();
        inventario.buscarProducto("A001");
        System.out.println();

        // Mostrar inventario completo
        System.out.println("Mostrando inventario completo:");
        inventario.mostrarInventario();
        System.out.println();

        // Eliminar producto
        inventario.eliminarProducto("E001");
        System.out.println();

        // Intentar buscar producto eliminado
        inventario.buscarProducto("E001");
    }
}


//import java.time.LocalDate;
//
///**
// * Clase Main para probar la gestión de inventario.
// */
//public class Main {
//    public static void main(String[] args) {
//        Inventario inventario = new Inventario();
//
//        // Agregar productos
//        inventario.agregarProducto(new Electronico("E001", "Laptop", 15000, 24));
//        inventario.agregarProducto(new Alimento("A001", "Leche", 25, LocalDate.of(2025, 5, 10)));
//
//        // Mostrar inventario
//        System.out.println("Inventario:");
//        inventario.mostrarInventario();
//
////        // Buscar un producto
////        System.out.println("\nBuscando producto con código A001:");
////        System.out.println(inventario.buscarProducto("A001"));
//        
//        // Buscar producto
//        System.out.println("\nBuscando producto con código A001:");
//        Producto producto = inventario.buscarProducto("A001");
//        if (producto != null) {
//            producto.mostrarDetalles();
//        } else {
//            System.out.println("Producto no encontrado.");
//        }
//
//        // Eliminar un producto
//        System.out.println("\nEliminar producto con código E001");
//        inventario.eliminarProducto("E001");
//        System.out.println("\nInventario después de eliminar el producto E001:");
//        inventario.mostrarInventario();
//    }
//}

