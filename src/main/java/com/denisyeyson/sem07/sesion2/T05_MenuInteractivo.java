package com.denisyeyson.sem07.sesion2;

import java.util.Scanner;

public class T05_MenuInteractivo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("""
                    +---------------------------------------------------+
                    |                 MENU DE OPCIONES                  |
                    +---------------------------------------------------+
                    | 1. Mostrar contador progresivo (1 al 5)           |
                    | 2. Mostrar contador regresivo (5 al 1)            |
                    | 3. Calcular la suma de los números del 1 al 10    |
                    | 4. Mostrar el doble de un número                  |
                    | 5. Salir del programa                             |
                    +---------------------------------------------------+
                    Seleccione una opción:\s""");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Conteo Progresivo ---");
                    int a = 1;
                    do {
                        System.out.println("Número: " + a++);
                    } while (a <= 5);
                    break;

                case 2:
                    System.out.println("\n--- Conteo Regresivo ---");
                    int b = 5;
                    do {
                        System.out.println("Número: " + b--);
                    } while (b >= 1);
                    break;

                case 3:
                    System.out.println("\n--- Suma del 1 al 10 ---");
                    int c = 1, suma = 0;
                    do {
                        suma += c++;
                    } while (c <= 10);
                    System.out.println("Suma total = " + suma);
                    break;

                case 4:
                    System.out.print("\nIngrese un número: ");
                    int num = scanner.nextInt();
                    System.out.println("El doble de " + num + " es: " + (num * 2));
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el programa! Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
