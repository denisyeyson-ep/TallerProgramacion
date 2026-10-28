package com.denisyeyson.sem10.sesion2;

import java.util.Scanner;

public class PC2_Pregunta1 {

    /**
     * <b><i>Practica 02: Pregunta 01</i></b><br>
     * Una empresa de servicios digitales necesita controlar el acceso a una sección restringida de su sistema interno.
     * Para ello, el usuario deberá ingresar un código de seguridad.
     * Si el usuario ingresa un formato inválido, deberá mostrar el mensaje “FORMATO DE CÓDIGO NO VÁLIDO” y solicitar nuevamente el ingreso.
     * El código correcto del sistema es “3745” y el usuario tendrá como máximo tres intentos válidos para ingresarlo correctamente.
     * Un ingreso con formato incorrecto no deberá descontar intentos. Cada vez que el usuario ingrese un código con formato válido,
     * pero diferente de `3745`, el programa deberá mostrar “CÓDIGO INCORRECTO” e indicar cuántos intentos válidos le quedan disponibles.
     * Si el usuario ingresa correctamente el código antes de agotar los tres intentos, el programa deberá mostrar “ACCESO AUTORIZADO” y
     * finalizar el proceso. Si utiliza los tres intentos válidos sin ingresar el código correcto, deberá mostrar “ACCESO BLOQUEADO”.
     * Finalmente, deberá mostrar la cantidad de intentos válidos utilizados.
     * Todos los datos ingresados deberán ser leídos mediante la clase `Scanner`.
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int cantIntentos = 0;

        do {
            System.out.print("Ingrese el código de seguridad (4 dígitos): ");
            String codigoSeguridad = scanner.nextLine().trim();
            if (codigoSeguridad.length() != 4 || !codigoSeguridad.matches("\\d{4}")) {
                System.out.println("FORMATO DE CÓDIGO NO VÁLIDO\n");
            } else {
                cantIntentos++;
                if (codigoSeguridad.equals("3745")) {
                    System.out.println("ACCESO AUTORIZADO");

                    break;
                } else {
                    System.out.println("CÓDIGO INCORRECTO");
                    System.out.printf("Le quedan %d intento(s)\n\n", (3 - cantIntentos));
                }
                if (cantIntentos == 3) {
                    System.out.println("ACCESO BLOQUEADO");
                }
            }
        } while (cantIntentos < 3);
        System.out.println("Cantidad de intentos realizados: " + cantIntentos);
        scanner.close();
    }
}
