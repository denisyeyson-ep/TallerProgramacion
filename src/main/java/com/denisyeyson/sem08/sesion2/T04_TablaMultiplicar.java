package com.denisyeyson.sem08.sesion2;

import java.util.Scanner;

public class T04_TablaMultiplicar {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Hasta qué tabla de multiplicar desea generar?: ");
        int tablas = entrada.nextInt();

        for (int i = 1; i <= tablas; i++) {
            System.out.println("\n--- Tabla del " + i + " ---");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        entrada.close();
    }
}
