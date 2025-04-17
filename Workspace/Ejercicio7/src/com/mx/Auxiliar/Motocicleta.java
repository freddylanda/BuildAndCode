package com.mx.Auxiliar;

public class Motocicleta extends Vehiculo{

	String tipoManubrio;

    // Constructor
    public Motocicleta(String marca, String modelo, int anio, String tipoManubrio) {
        super(marca, modelo, anio);  // Llama al constructor de Vehiculo
        this.tipoManubrio = tipoManubrio;
    }

    // Método adicional
    public void hacerCaballito() {
        System.out.println("¡Mira ese caballito!");
    }

    // Override opcional para mostrar también el tipo de manubrio
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de manubrio: " + tipoManubrio);
    }
}
