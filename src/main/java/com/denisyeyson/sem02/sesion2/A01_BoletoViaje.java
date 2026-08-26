package com.denisyeyson.sem02.sesion2;

import java.util.Scanner;

public class A01_BoletoViaje {

    /**
     * Imprime un boleto de viaje interprovincial utilizando datos ingresados por teclado.
     *  *
     *  * <p>El ejemplo utiliza los ocho tipos primitivos de Java y los métodos
     *  * String.toUpperCase() y String.toLowerCase().</p>
     */
    static void main() {
        // Scanner se utiliza para leer todos los datos desde teclado.
        Scanner scanner = new Scanner(System.in);

        // String: datos textuales del pasajero y de la ruta.
        System.out.print("Ingrese nombre del pasajero: ");
        String pasajero = scanner.nextLine();
        System.out.print("Ingrese ciudad de origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese ciudad de destino: ");
        String destino = scanner.nextLine();
        System.out.print("Ingrese nombre de la empresa: ");
        String empresa = scanner.nextLine();

        // byte: adecuado para una edad pequeña.
        System.out.print("Ingrese edad del pasajero: ");
        byte edad = scanner.nextByte();

        // short: suficiente para un número de asiento.
        System.out.print("Ingrese número de asiento: ");
        short asiento = scanner.nextShort();

        // int: cantidad de equipajes.
        System.out.print("Ingrese cantidad de equipajes: ");
        int equipajes = scanner.nextInt();

        // long: permite almacenar un DNI como valor entero.
        System.out.print("Ingrese DNI: ");
        long dni = scanner.nextLong();

        // float: peso del equipaje con decimales.
        System.out.print("Ingrese peso del equipaje en kg: ");
        float pesoEquipaje = scanner.nextFloat();

        // double: precio monetario del pasaje.
        System.out.print("Ingrese precio del pasaje: ");
        double precio = scanner.nextDouble();

        // char: un carácter representa el tipo de servicio.
        System.out.print("Ingrese tipo de servicio (E=Económico / V=VIP): ");
        char tipoServicio = scanner.next().charAt(0);

        // boolean: indica si el pasajero cuenta con seguro.
        System.out.print("¿Tiene seguro de viaje? (true/false): ");
        boolean tieneSeguro = scanner.nextBoolean();

        // Se usan los métodos String solicitados en el ejercicio.
        pasajero = pasajero.toUpperCase();
        origen = origen.toUpperCase();
        destino = destino.toUpperCase();
        empresa = empresa.toLowerCase();

        // Impresión final del boleto con printf.
        System.out.println("\n==============================================");
        System.out.println("           BOLETO INTERPROVINCIAL");
        System.out.println("==============================================");
        System.out.printf("Empresa       : %s%n", empresa);
        System.out.printf("Pasajero      : %s%n", pasajero);
        System.out.printf("DNI           : %d%n", dni);
        System.out.printf("Edad          : %d años%n", edad);
        System.out.printf("Origen        : %s%n", origen);
        System.out.printf("Destino       : %s%n", destino);
        System.out.printf("Asiento       : %d%n", asiento);
        System.out.printf("Equipajes     : %d%n", equipajes);
        System.out.printf("Peso equipaje : %.2f kg%n", pesoEquipaje);
        System.out.printf("Servicio      : %c%n", Character.toUpperCase(tipoServicio));
        System.out.printf("Seguro        : %b%n", tieneSeguro);
        System.out.println("----------------------------------------------");
        System.out.printf("PRECIO        : S/. %10.2f%n", precio);
        System.out.println("==============================================");
        System.out.println("                BUEN VIAJE");
        System.out.println("==============================================");

        // Se cierra Scanner al finalizar la lectura.
        scanner.close();
    }
}
