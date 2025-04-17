package com.mx.Principal;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.mx.Entidad.Motocicleta;
import com.mx.Entidad.Servicio;
import com.mx.Implementacion.MotocicletaServiceImpl;

public class MenuTaller {

	private static final Scanner scanner = new Scanner(System.in);
    private static final MotocicletaServiceImpl servicio = new MotocicletaServiceImpl();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\n----- MENU TALLER -----");
        System.out.println("1. Crear motocicleta");
        System.out.println("2. Listar motocicletas");
        System.out.println("3. Buscar motocicleta");
        System.out.println("4. Actualizar motocicleta");
        System.out.println("5. Eliminar motocicleta");
        System.out.println("6. Agregar servicio");
        System.out.println("7. Ver historial de servicios");
        System.out.println("8. Ver gasto total en servicios");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> crearMotocicleta();
            case 2 -> listarMotocicletas();
            case 3 -> buscarMotocicleta();
            case 4 -> actualizarDatosMotocicleta();
            case 5 -> eliminarMotocicleta();
            case 6 -> agregarServicio();
            case 7 -> verHistorialServicios();
            case 8 -> calcularGastoTotal();
            case 9 -> System.out.println("Saliendo del programa...");
            default -> System.out.println("Opción no válida, intente de nuevo.");
        }
    }

    private static void crearMotocicleta() {
    	int id;
    	// Validar entrada del usuario para que el ID sea un número válido
        System.out.print("Ingrese ID de la motocicleta: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido como ID.");
            System.out.print("Ingrese ID de la motocicleta: ");
            scanner.next();
        }
        id = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        // Validar que el ID no esté repetido
        while (servicio.buscarMotocicleta(id) != null) {
            System.out.println("Error: El ID " + id + " ya está registrado. Ingrese otro ID: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido como ID.");
                System.out.print("Ingrese ID de la motocicleta: ");
                scanner.next();
            }
            id = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese año: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido para el año.");
            System.out.print("Ingrese año: ");
            scanner.next(); // Limpia la entrada incorrecta
        }
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        try {
            Motocicleta moto = new Motocicleta(id, marca, modelo, anio);
            servicio.crearMotocicleta(moto);
            System.out.println("Motocicleta creada exitosamente con ID " + id + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void listarMotocicletas() {
    	if (servicio.listarMotocicletas().isEmpty()) {
            System.out.println("No hay motocicletas registradas actualmente.");
            return;
        }

        servicio.listarMotocicletas().forEach(System.out::println);
    }

    private static void buscarMotocicleta() {
    	if (servicio.listarMotocicletas().isEmpty()) {
            System.out.println("No hay motocicletas registradas actualmente.");
            return;
        }

        System.out.print("Ingrese ID de la motocicleta: ");
        int id = scanner.nextInt();

        Motocicleta moto = servicio.buscarMotocicleta(id);
        System.out.println(moto != null ? moto : "Error: La motocicleta con ID " + id + " no existe.");
    }
    	
        private static void actualizarDatosMotocicleta() {
        	if (servicio.listarMotocicletas().isEmpty()) {
                System.out.println("No hay motocicletas registradas actualmente.");
                System.out.print("¿Desea registrar una nueva motocicleta? ('S' para sí, 'N' para no): ");
                String respuesta = scanner.next().toUpperCase();
                scanner.nextLine(); // Limpiar buffer
                
                if (respuesta.equals("S")) {
                    crearMotocicleta();
                    return;
                } else {
                    System.out.println("No se agregará ningún registro.");
                    return;
                }
            }

        	// Mostrar motocicletas disponibles antes de pedir el ID
            System.out.println("\nMotocicletas registradas:");
            servicio.listarMotocicletas().forEach(System.out::println);

            System.out.print("Ingrese ID de la motocicleta a actualizar: ");
            int idMoto = scanner.nextInt();
            scanner.nextLine();

            Motocicleta motoSeleccionada = servicio.buscarMotocicleta(idMoto);
            if (motoSeleccionada == null) {
                System.out.println("Error: La motocicleta con ID " + idMoto + " no existe. No se realizará la actualización.");
                return;
            }

            System.out.println("\n¿Qué desea modificar?");
            System.out.println("1. Datos de la motocicleta");
            System.out.println("2. Servicios asignados");
            System.out.println("3. Ambos");
            System.out.println("4. Cancelar");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1 || opcion == 3) {
                actualizarMotocicleta(idMoto, motoSeleccionada);
            }

            if (opcion == 2 || opcion == 3) {
                actualizarServicio(idMoto);
            }

            if (opcion == 4) {
                System.out.println("Actualización cancelada.");
                return;
            }
        }

        // Método para actualizar atributos de la motocicleta
        private static void actualizarMotocicleta(int idMoto, Motocicleta motoSeleccionada) {
            String marca = motoSeleccionada.getMarca();
            String modelo = motoSeleccionada.getModelo();
            int anio = motoSeleccionada.getAnio();

            System.out.println("\n¿Qué atributo de la motocicleta desea modificar?");
            System.out.println("1. Marca");
            System.out.println("2. Modelo");
            System.out.println("3. Año");
            System.out.println("4. Todos");
            System.out.println("5. Cancelar");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nueva marca: ");
                    marca = scanner.nextLine();
                }
                case 2 -> {
                    System.out.print("Ingrese nuevo modelo: ");
                    modelo = scanner.nextLine();
                }
                case 3 -> {
                    System.out.print("Ingrese nuevo año: ");
                    anio = scanner.nextInt();
                }
                case 4 -> {
                    System.out.print("Ingrese nueva marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Ingrese nuevo modelo: ");
                    modelo = scanner.nextLine();
                    System.out.print("Ingrese nuevo año: ");
                    anio = scanner.nextInt();
                }
                case 5 -> {
                    System.out.println("Actualización cancelada.");
                    return;
                }
                default -> {
                    System.out.println("Opción inválida. No se realizará la actualización.");
                    return;
                }
            }

            try {
                Motocicleta motoNueva = new Motocicleta(idMoto, marca, modelo, anio);
                servicio.actualizarMotocicleta(idMoto, motoNueva);
                System.out.println("Motocicleta actualizada exitosamente.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Método para actualizar servicios de la motocicleta
        private static void actualizarServicio(int idMoto) {
            List<Servicio> historial = servicio.verHistorialServicios(idMoto);
            if (historial.isEmpty()) {
                System.out.println("La motocicleta con ID " + idMoto + " no tiene servicios registrados.");
                return;
            }

            System.out.println("\nServicios asignados:");
            for (int i = 0; i < historial.size(); i++) {
                System.out.println((i + 1) + ". " + historial.get(i));
            }

            System.out.print("\nIngrese el número del servicio que desea modificar: ");
            int indiceServicio = scanner.nextInt() - 1;
            scanner.nextLine();

            if (indiceServicio < 0 || indiceServicio >= historial.size()) {
                System.out.println("Error: Número de servicio inválido.");
                return;
            }

            Servicio servicioSeleccionado = historial.get(indiceServicio);

            System.out.println("\n¿Qué atributo del servicio desea modificar?");
            System.out.println("1. Descripción");
            System.out.println("2. Costo");
            System.out.println("3. Ambos");
            System.out.println("4. Cancelar");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            String descripcion = servicioSeleccionado.getDescripcion();
            double costo = servicioSeleccionado.getCosto();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nueva descripción: ");
                    descripcion = scanner.nextLine();
                }
                case 2 -> {
                    System.out.print("Ingrese nuevo costo: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                        scanner.next();
                    }
                    costo = scanner.nextDouble();
                    scanner.nextLine();
                }
                case 3 -> {
                    System.out.print("Ingrese nueva descripción: ");
                    descripcion = scanner.nextLine();
                    System.out.print("Ingrese nuevo costo: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                        scanner.next();
                    }
                    costo = scanner.nextDouble();
                    scanner.nextLine();
                }
                case 4 -> {
                    System.out.println("Actualización cancelada.");
                    return;
                }
                default -> {
                    System.out.println("Opción inválida. No se realizará la actualización.");
                    return;
                }
            }

            try {
                Servicio servicioActualizado = new Servicio(descripcion, costo, servicioSeleccionado.getFecha());
                servicio.actualizarServicio(idMoto, indiceServicio, servicioActualizado);
                System.out.println("Servicio actualizado exitosamente.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    private static void eliminarMotocicleta() {
    	if (servicio.listarMotocicletas().isEmpty()) {
            System.out.println("No hay motocicletas registradas actualmente.");
            return;
        }
        
        System.out.print("Ingrese ID de la motocicleta a eliminar: ");
        int id = scanner.nextInt();

        // Validar si la motocicleta existe antes de intentar eliminarla
        if (servicio.buscarMotocicleta(id) == null) {
            System.out.println("Error: La motocicleta con ID " + id + " no existe.");
            return;
        }

        servicio.eliminarMotocicleta(id);
        System.out.println("Motocicleta eliminada exitosamente.");
    }

    private static void agregarServicio() {
        // Validamos si hay motocicletas registradas antes de pedir datos
        if (servicio.listarMotocicletas().isEmpty()) {
            System.out.println("No hay motocicletas registradas actualmente. No se puede agregar un servicio.");
            System.out.print("¿Desea registrar una nueva motocicleta? ('S' para sí, 'N' para no): ");
            String respuesta = scanner.next().toUpperCase();
            scanner.nextLine(); // Limpiar buffer

            if (respuesta.equals("S")) {
                crearMotocicleta();
                Motocicleta nuevaMoto = servicio.listarMotocicletas().get(servicio.listarMotocicletas().size() - 1);
                
                System.out.print("¿Desea asignar un servicio a la motocicleta registrada? ('S' para sí, 'N' para no): ");
                respuesta = scanner.next().toUpperCase();
                scanner.nextLine(); // Limpiar buffer

                if (respuesta.equals("S")) {
                    solicitarDatosServicio(nuevaMoto.getId());
                }
                // En este punto, si el usuario dijo "No", simplemente regresamos al menú sin pedir ID manualmente.
                return;
            } else {
                System.out.println("No se agregará ningún servicio.");
                return;
            }
        }

        // Mostrar motocicletas disponibles antes de pedir el ID
        System.out.println("\nMotocicletas registradas:");
        servicio.listarMotocicletas().forEach(System.out::println);

        System.out.print("\nIngrese ID de la motocicleta a la que desea agregar el servicio: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Motocicleta motoSeleccionada = servicio.buscarMotocicleta(id);
        if (motoSeleccionada == null) {
            System.out.println("Error: La motocicleta con ID " + id + " no existe.");
            return;
        }

        solicitarDatosServicio(motoSeleccionada.getId());
    }

    // Método auxiliar para solicitar datos del servicio y agregarlo a la motocicleta
    private static void solicitarDatosServicio(int idMoto) {
        System.out.print("Ingrese descripción del servicio: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese costo del servicio: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            scanner.next();
        }
        double costo = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer después de leer el número

        try {
            Servicio servicioNuevo = new Servicio(descripcion, costo, LocalDate.now());
            servicio.agregarServicio(idMoto, servicioNuevo);
            System.out.println("Servicio agregado correctamente a la motocicleta con ID " + idMoto + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void verHistorialServicios() {
    	if (servicio.listarMotocicletas().isEmpty()) {
            System.out.println("No hay motocicletas registradas actualmente.");
            return;
        }
    	
        System.out.print("Ingrese ID de la motocicleta: ");
        int id = scanner.nextInt();

        Motocicleta moto = servicio.buscarMotocicleta(id);
        if (moto == null) {
            System.out.println("Error: La motocicleta con ID " + id + " no existe.");
            return;
        }

        List<Servicio> historial = servicio.verHistorialServicios(id);
        if (historial.isEmpty()) {
            System.out.println("La motocicleta con ID " + id + " no tiene historial de servicios.");
        } else {
            historial.forEach(System.out::println);
        }
    }

    private static void calcularGastoTotal() {
    	if (servicio.listarMotocicletas().isEmpty()) {
    	    System.out.println("No hay motocicletas registradas actualmente.");
    	    return;
    	}

        System.out.print("Ingrese ID de la motocicleta: ");
        int id = scanner.nextInt();

        Motocicleta moto = servicio.buscarMotocicleta(id);
        if (moto == null) {
            System.out.println("Error: La motocicleta con ID " + id + " no existe.");
            return;
        }

        double gastoTotal = servicio.calcularGastoTotal(id);
        if (gastoTotal > 0) {
            System.out.println("Gasto total en servicios: $" + gastoTotal);
        } else {
            System.out.println("La motocicleta con ID " + id + " no tiene gastos registrados.");
        }
    }
}
