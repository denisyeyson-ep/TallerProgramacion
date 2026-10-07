package com.denisyeyson.sem09.sesion2;

import java.util.Scanner;

public class T03_CopiaArreglos {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo original: ");
        int n = scanner.nextInt();
        int[] original = new int[n];

        // Lectura del arreglo original
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor entero para la posición [" + i + "]: ");
            original[i] = scanner.nextInt();
        }

        System.out.println("\n--- MENU DE COPIA DE ARREGLOS ---");
        System.out.println("1. Copia TOTAL");
        System.out.println("2. Copia PARCIAL (Por Rango)");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        int[] copia;

        if (opcion == 1) {
            // Copia total del arreglo
            copia = new int[original.length];
            System.arraycopy(original, 0, copia, 0, original.length);
            System.out.println("\n-> Se ha realizado la COPIA TOTAL del arreglo.");

        } else if (opcion == 2) {
            // Copia parcial por rango
            System.out.print("Ingrese el indice INICIAL (0 a " + (n - 1) + "): ");
            int inicio = scanner.nextInt();
            System.out.print("Ingrese el indice FINAL (de " + inicio + " a " + (n - 1) + "): ");
            int fin = scanner.nextInt();

            // Validación rápida de rangos
            if (inicio < 0 || fin >= n || inicio > fin) {
                System.out.println("Indices inválidos. Se asignara un arreglo vacío por defecto.");
                copia = new int[0];
            } else {
                int tamanioCopia = (fin - inicio) + 1;
                copia = new int[tamanioCopia];

                System.arraycopy(original, inicio, copia, 0, tamanioCopia);
                System.out.println("\n-> Se ha realizado la COPIA PARCIAL desde la posición ["
                        + inicio + "] hasta [" + fin + "].");
            }
        } else {
            System.out.println("Opción no valida.");
            copia = new int[0];
        }

        // Mostrar el arreglo resultante
        System.out.println("\nArreglo Resultante:");
        if (copia.length == 0) {
            System.out.println("[ Arreglo Vacío ]");
        } else {
            for (int j : copia) {
                System.out.print("[" + j + "] ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
