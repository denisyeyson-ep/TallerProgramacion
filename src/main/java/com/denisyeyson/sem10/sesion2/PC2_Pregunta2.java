package com.denisyeyson.sem10.sesion2;

import java.util.Scanner;

public class PC2_Pregunta2 {

    /**
     * <b><i>Practica 02: Pregunta 02</i></b><br>
     * Una empresa organizadora de eventos necesita generar automáticamente la numeración de las mesas que se instalarán en
     * las diferentes zonas de un centro de convenciones.
     * Cada zona tendrá exactamente cinco mesas y la cantidad de zonas será ingresada por el usuario.
     * Solo se podrán habilitar entre una y seis zonas; si el usuario ingresa un valor fuera de ese rango,
     * el programa deberá mostrar el mensaje “CANTIDAD DE ZONAS NO VÁLIDA” y finalizar.
     * La numeración de las mesas deberá generarse automáticamente utilizando la zona como parte del número.
     * Por ejemplo, las mesas de la zona 1 deberán numerarse como 101, 102, 103, 104 y 105; las mesas
     * de la zona 2 como 201, 202, 203, 204 y 205; y así sucesivamente.
     * El programa deberá mostrar cada zona con todas las mesas que le corresponden y, al finalizar,
     * indicar la cantidad de zonas habilitadas, la cantidad de mesas por zona y la cantidad total de mesas generadas.
     * La numeración deberá obtenerse mediante cálculos realizados durante la ejecución y no podrá escribirse manualmente.
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int CANTIDAD_MESAS_POR_ZONA = 5;
        int cantidadMesas = 0;

        System.out.print("Ingrese la cantidad de zonas a registrar: ");
        int cantidadZonas = scanner.nextInt();

        if (cantidadZonas >= 1 && cantidadZonas <= 6) {
            for (int i = 0; i < cantidadZonas; i++) {
                System.out.println("Zona " + (i + 1) + ":");
                int zona = (i + 1) * 100;
                for (int j = 0; j < CANTIDAD_MESAS_POR_ZONA; j++) {
                    System.out.println("\tMesa " + (j + 1) + ": [" + (zona + (j + 1)) + "]");
                    cantidadMesas++;
                }
            }
            System.out.println("\nCantidad de zonas habilitadas: " + cantidadZonas);
            System.out.println("Cantidad de mesas por zona: " + CANTIDAD_MESAS_POR_ZONA);
            System.out.println("Cantidad total de mesas registradas: " + cantidadMesas);
        } else {
            System.out.println("CANTIDAD DE ZONAS NO VÁLIDA”");
        }
        scanner.close();
    }
}
