package com.mx.Auxiliar;

public class Main {

	public static void main(String[] args) {
        // Crear un objeto Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 2020, 4);
        System.out.println("Información del Auto:");
        miAuto.mostrarInformacion();
        miAuto.tocarBocina();

        System.out.println();

        // Crear un objeto Motocicleta
        Motocicleta miMoto = new Motocicleta("Yamaha", "MT-07", 2022, "Deportivo");
        System.out.println("Información de la Motocicleta:");
        miMoto.mostrarInformacion();
        miMoto.hacerCaballito();
    }

}
