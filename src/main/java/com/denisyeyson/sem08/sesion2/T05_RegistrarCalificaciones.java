package com.denisyeyson.sem08.sesion2;

import java.util.Scanner;

public class T05_RegistrarCalificaciones {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = entrada.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("\nIngrese la nota final del estudiante " + i + " (0 - 20): ");
            double nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 20) {
                if (nota >= 14) {
                    System.out.println("Estado: APROBADO (Excelente rendimiento)");
                } else if (nota >= 10.5) {
                    System.out.println("Estado: APROBADO (Rendimiento regular)");
                } else if (nota >= 7) {
                    System.out.println("Estado: DESAPROBADO (A sustitutorio)");
                } else {
                    System.out.println("Estado: DESAPROBADO (Sin opción a examen)");
                }
            } else {
                System.out.println("Nota no válida. Debe estar en el rango de 0 a 20.");
            }
        }
        entrada.close();
    }
}
