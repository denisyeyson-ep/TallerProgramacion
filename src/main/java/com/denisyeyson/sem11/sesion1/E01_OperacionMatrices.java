package com.denisyeyson.sem11.sesion1;

import java.util.Scanner;

public class E01_OperacionMatrices {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[] sumaFilas = new int[3];
        double[] promedioFilas = new double[3];

        int suma = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
                suma += matrizA[i][j];
            }
            sumaFilas[i] = suma;
            promedioFilas[i] = (double) suma / matrizA[i].length;
            suma = 0;
        }

        System.out.println("\n--- REPORTE DE MATRIZ A ---");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-15s %-15s\n", "MATRIZ A", "SUMA FILA", "PROMEDIO FILA");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("[%02d] ", matrizA[i][j]);
            }
            System.out.printf("\t[%02d]\t\t\t[%.2f]\n", sumaFilas[i], promedioFilas[i]);
        }

        scanner.close();
    }
}
