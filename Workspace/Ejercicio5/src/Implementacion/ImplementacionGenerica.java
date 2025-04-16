package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Principal.IMetodos;

public class ImplementacionGenerica implements IMetodos {
    protected List<Object> lista = new ArrayList<>();

    @Override
    public void guardar(Object key, Object value) {
        lista.add(value);
//        System.out.println("Guardado: " + value);
    }

//    @Override
//    public void editar(Object key, Object value) {
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i).equals(key)) {
//                lista.set(i, value);
//                System.out.println("Editado: " + value);
//                return;
//            }
//        }
//        System.out.println("No se encontró el elemento con clave: " + key);
//    }
    
//    @Override
//    public void editar(Object key, Object value) {
//        for (int i = 0; i < lista.size(); i++) {
//            Object obj = lista.get(i);
//
//            // Comparar si el objeto actual es el que queremos modificar
//            if (obj.equals(key)) {
//                lista.set(i, value);
//                System.out.println("Editado correctamente: " + value);
//                return;
//            }
//        }
//        System.out.println("No se encontró el elemento con clave: " + key);
//    }
    
    @Override
    public void editar(Object key, Object value) {
        for (int i = 0; i < lista.size(); i++) {
            Object obj = lista.get(i);

            // Comparación basada en atributos clave
            if (obj.toString().contains(key.toString())) {
                lista.set(i, value);
                System.out.println("Editado correctamente: " + value);
                return;
            }
        }
        System.out.println("No se encontró el elemento con clave: " + key);
    }
//
//    @Override
//    public void eliminar(Object key) {
//        lista.removeIf(obj -> obj.equals(key));
//        System.out.println("Elemento eliminado: " + key);
//    }
    
    @Override
    public void eliminar(Object key) {
        Object objetoAEliminar = null;

        for (Object obj : lista) {
            if (obj.toString().contains(key.toString())) {
                objetoAEliminar = obj;
                break;
            }
        }

        if (objetoAEliminar != null) {
            lista.remove(objetoAEliminar);
            System.out.println("Elemento eliminado correctamente: " + key);
        } else {
            System.out.println("No se encontró el elemento con clave: " + key);
        }
    }

//    @Override
//    public Object buscar(Object key) {
//        return lista.stream()
//                .filter(obj -> obj.equals(key))
//                .findFirst()
//                .orElse("Elemento no encontrado");
//    }
    
    @Override
    public Object buscar(Object key) {
        for (Object obj : lista) {
            if (obj.toString().contains(key.toString())) {
                return obj;
            }
        }
        return "Elemento no encontrado";
    }

    @Override
    public void mostrar() {
        System.out.println("Contenido de la lista:");
        lista.forEach(System.out::println);
    }

    public int contar() {
        return lista.size();
    }
}
