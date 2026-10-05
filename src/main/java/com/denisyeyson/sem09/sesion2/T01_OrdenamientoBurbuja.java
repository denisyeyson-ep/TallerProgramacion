package com.denisyeyson.sem09.sesion2;

import java.util.Scanner;

public class T01_OrdenamientoBurbuja {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos a registrar: ");
        int n = scanner.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero real [" + (i + 1) + "]: ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("\n--- MENU DE ORDENAMIENTO ---");
        System.out.println("1. Ordenar de forma Ascendente");
        System.out.println("2. Ordenar de forma Descendente");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();

        // Algoritmo de Ordenamiento (Burbuja)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                boolean condicion = (opcion == 1) ? (numeros[j] > numeros[j + 1])
                        : (numeros[j] < numeros[j + 1]);
                if (condicion) {
                    double aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("\nArreglo ordenado:");
        for (double num : numeros) {
            System.out.printf("[%.2f] ", num);
        }
        System.out.println();
        scanner.close();
    }
}
