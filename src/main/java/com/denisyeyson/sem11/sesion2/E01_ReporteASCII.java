package com.denisyeyson.sem11.sesion2;

public class E01_ReporteASCII {
    static void main() {

        String[] nombres = {
                "ANA MARIELA TORRES MONTEZ",
                "CARLOS ALBERTO ROJAS CHAN",
                "GABRIELA LUCIA ALVITES CH",
                "JUAN CARLOS GARCIA RODRIG",
                "ROSA INOÑAN FARRO"
        };

        int[] edades = {25, 24, 25, 19, 22};
        int[] grados = {5, 5, 5, 5, 4};

        // Matriz para PC1, PC2, PC3 y EF
        int[][] notas = {
                {20, 17, 18, 16}, // Ana
                {16, 18, 15, 12}, // Carlos
                {20, 20, 14, 15}, // Gabriela
                {20, 19, 15, 17}, // Juan
                {20, 18, 12, 13} // Rosa
        };

        double sumaPromedios = 0.0;

        System.out.println("#".repeat(24) + " REPORTE DE NOTAS " + "#".repeat(24));
        System.out.printf("%-28.28s %-5s %-5s %-4s %-4s %-4s %-4s %-4s\n", "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF", "PROM");
        System.out.println("#".repeat(66));
        for (int i = 0; i < notas.length; i++) {
            sumaPromedios += (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4.0;
            System.out.printf("%-28.28s %-5d %-5d %-4d %-4d %-4d %-4d %-4.2f\n", nombres[i], edades[i], grados[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4.0);
        }
        System.out.println("#".repeat(66));
        System.out.printf("PROMEDIO TOTAL:%51.51s\n", sumaPromedios / notas.length);
        System.out.println("#".repeat(66));
    }
}