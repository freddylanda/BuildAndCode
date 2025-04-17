package com.mx.Auxiliar;

public class Auto extends Vehiculo{

	int numeroPuertas;

    // Constructor
    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);  // Llama al constructor de Vehiculo
        this.numeroPuertas = numeroPuertas;
    }

    // Método adicional
    public void tocarBocina() {
        System.out.println("¡Beep beep!");
    }

    // Override opcional para mostrar también el número de puertas
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
