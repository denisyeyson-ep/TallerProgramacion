package com.denisyeyson.sem11.sesion2;

import java.util.Arrays;
import java.util.Scanner;

public class E02_OrdenarMatriz {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = {
                {5, 4, 7},
                {1, 3, 8},
                {2, 9, 6}
        };

        int opcion;
        do {
            System.out.println("====== MENÚ PRINCIPAL ======");
            System.out.println("1. Ordenar por fila");
            System.out.println("2. Ordenar por columna");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ordenarPorFila(matriz);
                    mostrarMatriz(matriz);
                    break;
                case 2:
                    ordenarPorColumna(matriz);
                    mostrarMatriz(matriz);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija entre 1 y 3.\n");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\n--- Matriz Actual ---");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ordenarPorFila(int[][] matriz) {
        for (int[] ints : matriz) {
            Arrays.sort(ints);
        }
    }

    public static void ordenarPorColumna(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas - 1; i++) {
                for (int k = i + 1; k < filas; k++) {
                    if (matriz[i][j] > matriz[k][j]) {
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[k][j];
                        matriz[k][j] = temp;
                    }
                }
            }
        }
    }
}