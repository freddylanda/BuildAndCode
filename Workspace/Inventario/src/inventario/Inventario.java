package inventario;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
        System.out.println("Producto agregado: " + producto.getCodigo());
    }

    public void buscarProducto(String codigo) {
        Producto producto = productos.get(codigo.trim());
        if (producto != null) {
            System.out.println("Producto encontrado:");
            producto.mostrarInformacion();
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(String codigo) {
        codigo = codigo.trim();
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
            System.out.println("Producto eliminado: " + codigo);
        } else {
            System.out.println("No se encontró el producto con código: " + codigo);
            System.out.println("Códigos existentes: " + productos.keySet());
        }
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario actual:");
            for (Producto p : productos.values()) {
                System.out.println("----------------------------");
                p.mostrarInformacion();
            }
            System.out.println("----------------------------");
        }
    }
}



//import java.util.HashMap;
//
///**
// * Clase Inventario que maneja productos con un HashMap.
// */
//public class Inventario {
//    private HashMap<String, Producto> productos;
//
//    public Inventario() {
//        productos = new HashMap<>();
//    }
//
//    /**
//     * Método para agregar un producto al inventario.
//     */
//    public void agregarProducto(Producto producto) {
//        productos.put(producto.getCodigo(), producto);
//    }
//
//    /**
//     * Método para buscar un producto por código.
//     */
//    public Producto buscarProducto(String codigo) {
//        return productos.get(codigo);
//    }
//
//    /**
//     * Método para eliminar un producto por código.
//     */
//    public void eliminarProducto(String codigo) {
//        productos.remove(codigo);
//    }
//
//    /**
//     * Método para mostrar todos los productos.
//     */
//    public void mostrarInventario() {
//        for (Producto producto : productos.values()) {
//            //System.out.println(producto);
//            producto.mostrarDetalles();
//        }
//    }
//    
//}

