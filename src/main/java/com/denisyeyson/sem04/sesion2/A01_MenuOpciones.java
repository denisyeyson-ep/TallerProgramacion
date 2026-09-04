package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class A01_MenuOpciones {

    /**
     * Actividad 1: Menú de opciones
     * Programa para convertir temperaturas y verificar el estado físico del agua
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.println("3. Verificar estado del agua según Celsius");
        System.out.print("Seleccione una opción: ");

        short opcion = teclado.nextShort();

        switch (opcion) {
            case 1:
                System.out.print("\nIngrese la temperatura en °C: ");
                double celsius1 = teclado.nextDouble();
                double fahrenheit1 = (celsius1 * 9 / 5) + 32;
                System.out.println(celsius1 + " °C equivale a " + fahrenheit1 + " °F.");
                break;
            case 2:
                System.out.print("\nIngrese la temperatura en °F: ");
                double fahrenheit2 = teclado.nextDouble();
                double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                System.out.println(fahrenheit2 + " °F equivale a " + celsius2 + " °C.");
                break;
            case 3:
                System.out.print("\nIngrese la temperatura en °C: ");
                double temp = teclado.nextDouble();

                if (temp <= 0) {
                    System.out.println("A " + temp + " °C el agua está en estado SÓLIDO (Hielo).");
                } else if (temp < 100) {
                    System.out.println("A " + temp + " °C el agua está en estado LÍQUIDO.");
                } else {
                    System.out.println("A " + temp + " °C el agua está en estado GASEOSO (Vapor).");
                }
                break;

            default:
                System.out.println("\nOpción inválida. Debe seleccionar entre 1 y 3.");
                break;
        }
        teclado.close();
    }
}
