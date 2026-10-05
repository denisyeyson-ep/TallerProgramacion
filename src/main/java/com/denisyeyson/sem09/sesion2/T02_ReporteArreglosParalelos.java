package com.denisyeyson.sem09.sesion2;

import java.util.Scanner;

public class T02_ReporteArreglosParalelos {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de empleados a registrar: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[n];
        double[] ventas = new double[n];

        double totalVentas = 0;
        int empleadosConMeta = 0;
        double metaVentas = 1000.00;

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Empleado " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Monto de ventas (S/.): ");
            ventas[i] = scanner.nextDouble();
            scanner.nextLine();

            totalVentas += ventas[i];
            if (ventas[i] >= metaVentas) {
                empleadosConMeta++;
            }
        }

        double promedioVentas = (n > 0) ? totalVentas / n : 0;

        // Muestra de Reporte ASCII
        System.out.println("\n=======================================================");
        System.out.println("                 REPORTE DE VENTAS                     ");
        System.out.println("=======================================================");
        System.out.printf("| %-4s | %-25s | %-12s |\n", "ID", "NOMBRE DEL EMPLEADO", "VENTAS (S/.)");
        System.out.println("---------------+---------------------------+-----------");

        for (int i = 0; i < n; i++) {
            System.out.printf("| %-4d | %-25s | %10.2f  |\n", (i + 1), nombres[i], ventas[i]);
        }

        System.out.println("=======================================================");
        System.out.printf(" Total acumulado de ventas : S/.%.2f\n", totalVentas);
        System.out.printf(" Promedio global de ventas : S/.%.2f\n", promedioVentas);
        System.out.printf(" Empleados que alcanzaron la meta (S/.%.2f): %d\n", metaVentas, empleadosConMeta);
        System.out.println("=======================================================");

        scanner.close();
    }
}
